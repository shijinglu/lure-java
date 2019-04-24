package org.shijinglu.lure.extensions;

import static org.junit.Assert.*;

import org.junit.Test;

public class VersionDataTest {

    @Test
    public void compareTo() {
        VersionData v1 = new VersionData("semver", "v3.2.1");
        VersionData v2 = new VersionData("semver", "v3.2.1");
        VersionData v3 = new VersionData("semver", "v3.4.1");
        VersionData v4 = new VersionData("semver", "v3.4.0");

        assertEquals(0, v2.compareTo(v1));
        assertEquals(2, v3.compareTo(v1));
        assertEquals(2, v4.compareTo(v1));
        assertEquals(-1, v4.compareTo(v3));
    }
}
