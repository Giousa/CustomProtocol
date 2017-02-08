package com.giousa.customprotocol.casefour;

import java.util.Arrays;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午11:28
 */

public class Teat4 {

    public static void main(String[] args) {


        //序列化  [0, 0, 0, 0, 0, 0, 39, 18, 0, 0, 0, 23, 0, 1, 0, 0, 0, 101, 1, 0, 0, 3, -25, 0, 6, 103, 105, 111, 117, 115, 97]
        Player player = new Player();

        player.setPlayerId(10002l);
        player.setAge(23);
        player.getSkills().add(101);
        player.getStudent().setGold(999);
        player.getStudent().setName("giousa");

        byte[] bytes = player.getBytes();

        System.out.println(Arrays.toString(bytes));

        //=======================================

        //反序列化  Player{playerId=10002, age=23, skills=[101], student=Student{gold=999, name='giousa'}}
        Player player2 = new Player();

        player2.readFromBytes(bytes);

        System.out.println(player2.toString());

    }
}
