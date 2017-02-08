package com.giousa.customprotocol.casefour;

import com.giousa.customprotocol.utils.Serializer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午11:25
 */

public class Player extends Serializer {


    private long playerId;

    private int age;

    private List<Integer> skills = new ArrayList<>();

    private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getSkills() {
        return skills;
    }

    public void setSkills(List<Integer> skills) {
        this.skills = skills;
    }

    @Override
    protected void read() {
        this.playerId = readLong();
        this.age = readInt();
        this.skills = readList(Integer.class);
        this.student = read(Student.class);
    }

    @Override
    protected void write() {
        writeLong(playerId);
        writeInt(age);
        writeList(skills);
        writeObject(student);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", age=" + age +
                ", skills=" + skills +
                ", student=" + student +
                '}';
    }
}
