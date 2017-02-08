package com.giousa.customprotocol.casefour;

import com.giousa.customprotocol.utils.Serializer;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午11:33
 */

public class Student extends Serializer {

    private int gold;
    private String name;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void read() {
        this.gold = readInt();
        this.name = readString();
    }

    @Override
    protected void write() {
        writeInt(gold);
        writeString(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "gold=" + gold +
                ", name='" + name + '\'' +
                '}';
    }
}
