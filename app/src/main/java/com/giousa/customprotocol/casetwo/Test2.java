package com.giousa.customprotocol.casetwo;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午11:00
 */

public class Test2 {

    public static void main(String[] args) {
        int id = 101;
        int age = 21;


        //序列化
        ByteBuffer buffer = ByteBuffer.allocate(8);

        buffer.putInt(id);
        buffer.putInt(age);

        byte[] bys = buffer.array();

        System.out.println(Arrays.toString(bys));

        //==========================

        //反序列化
        ByteBuffer buffer2 = ByteBuffer.wrap(bys);
        System.out.println("id:"+buffer2.getInt());
        System.out.println("age:"+buffer2.getInt());
    }
}
