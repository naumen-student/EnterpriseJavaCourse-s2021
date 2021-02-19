package ru.urfu.rtfdemo.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FDao {

    private static List<String> messages = new CopyOnWriteArrayList<>();

    public static void add(String msg) {
        messages.add(msg);
    }

    public static List<String> getMsg(){
        return messages;
    }
}
