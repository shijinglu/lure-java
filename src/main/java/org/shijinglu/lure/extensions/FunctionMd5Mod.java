package org.shijinglu.lure.extensions;

import org.shijinglu.lure.LureException;
import org.shijinglu.lure.core.BoolData;
import org.shijinglu.lure.core.IntData;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import static org.shijinglu.lure.LureException.ExceptionType.CastError;

public class FunctionMd5Mod implements IFunction {
    @Override
    public String functionName() {
        return "md5mod";
    }

    @Override
    public IData derive(List<IData> params) throws LureException {
        if (params.size() < 2) {
            throw LureException.of(CastError, "MD5MOD function needs at least two parameters");
        }
        String text = params.get(0).toString();
        int amp = params.get(1).toInt();
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(text.getBytes());
            long residue = Math.abs(ByteBuffer.wrap(md5.digest()).getLong()) % amp;
            return new IntData((int) residue);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return BoolData.FLASE;
    }
}
