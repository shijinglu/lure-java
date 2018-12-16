package org.shijinglu.lure.extensions;


import org.shijinglu.lure.LureException;

import static org.shijinglu.lure.LureException.ExceptionType.CastError;

public class VersionData implements IData {

    private final String _extKey;
    private final int major;

    private final int minor;
    private final int patch;

    public VersionData(String extKey, String rawVal) throws LureException {
        _extKey = extKey;
        try {
            String splits[] = rawVal.split("\\.");
            int ver[] = new int[3];
            for (int i = 0; i < splits.length && i < 3; i++) {
                ver[i] = Integer.parseInt(splits[i].replaceAll("[^\\d.]", ""));
            }
            major = ver[0];
            minor = ver[1];
            patch = ver[2];
        } catch (NumberFormatException e) {
            throw LureException.of(CastError, rawVal + " is not a valid version");
        }
    }

    @Override
    public String extKey() {
        return _extKey;
    }

    @Override
    public int compareTo(IData rhs) {
        if (rhs == null) {
            return 1;
        }
        if (rhs instanceof VersionData) {
            VersionData rhVer = (VersionData) rhs;
            if (rhVer.major != major) {
                return major - rhVer.major;
            }
            if (rhVer.minor != minor) {
                return minor - rhVer.minor;
            }
            if (rhVer.patch != patch) {
                return patch - rhVer.patch;
            }
            return 0;
        } else {
            return this.compareTo(new VersionData(_extKey, rhs.toString()));
        }
    }

    @Override
    public boolean toBool() {
        return !(major == 0 && minor == 0 && patch == 0);
    }

    @Override
    public int toInt() {
        return Integer.valueOf(String.valueOf(major) + String.valueOf(minor) + String.valueOf(patch));
    }

    @Override
    public double toDouble() {
        return (double) toInt();
    }

    @Override
    public String toString() {
        return String.format("v%d.%d.%d", major, minor, patch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionData that = (VersionData) o;

        if (major != that.major) return false;
        if (minor != that.minor) return false;
        return patch == that.patch;
    }

    @Override
    public int hashCode() {
        int result = major;
        result = 31 * result + minor;
        result = 31 * result + patch;
        return result;
    }

    public static class VersionDataBuilder implements IDataFactory {
        @Override
        public IData create(String valRaw, String extKey) {
            return new VersionData(extKey, valRaw);
        }
    }
}
