package com.giousa.customprotocol.caseone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午10:32
 */

public class Test1 {
    public static void main(String[] args) throws IOException {

        int id = 101;
        int age = 21;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byteArrayOutputStream.write(int2Bytes(id));
        byteArrayOutputStream.write(int2Bytes(age));

        byte[] bytes = byteArrayOutputStream.toByteArray();

        System.out.println(Arrays.toString(bytes));

        //================================================

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        byte[] idBytes = new byte[4];
        byteArrayInputStream.read(idBytes);
        System.out.println("id:"+bytes2Int(idBytes));

        byte[] ageBytes = new byte[4];
        byteArrayInputStream.read(ageBytes);
        System.out.println("age:"+bytes2Int(ageBytes));

    }


    /**
     * 大端字节序列(先写高位,再写地位) ---- 小端序列(先写地位,再写高位)
     * @param i
     * @return
     *
     * [0, 0, 0, 101, 0, 0, 0, 21]
     */
    private static byte[] int2Bytes(int i){

        byte[] bytes = new byte[4];

        bytes[0] = (byte) (i >> 3 * 8);
        bytes[1] = (byte) (i >> 2 * 8);
        bytes[2] = (byte) (i >> 1 * 8);
        bytes[3] = (byte) (i >> 0 * 8);

        return bytes;
    }

    private static int bytes2Int(byte[] bytes){
        return (bytes[0] << 3*8)|(bytes[1] << 2*8)|(bytes[3] << 1*8)|(bytes[3] << 0*8);
    }
}
