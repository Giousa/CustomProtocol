package com.giousa.customprotocol.casethree;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import java.util.Arrays;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午11:09
 */

public class Test3 {

    public static void main(String[] args) {

        int id = 101;
        double flag = 21.9;


        //序列化  [0, 0, 0, 101, 64, 53, -26, 102, 102, 102, 102, 102]
        ChannelBuffer channelBuffer = ChannelBuffers.dynamicBuffer();
        channelBuffer.writeInt(id);
        channelBuffer.writeDouble(flag);

        byte[] bytes = new byte[channelBuffer.writerIndex()];
        channelBuffer.readBytes(bytes);

        System.out.println(Arrays.toString(bytes));

        //=====================================

        //反序列化
        ChannelBuffer wrappedBuffer = ChannelBuffers.wrappedBuffer(bytes);
        System.out.println(wrappedBuffer.readInt());
        System.out.println(wrappedBuffer.readDouble());

    }
}
