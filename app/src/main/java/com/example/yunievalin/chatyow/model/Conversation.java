package com.example.yunievalin.chatyow.model;

import java.util.ArrayList;

/**
 * Created by yunievalin on 30/10/17.
 */

public class Conversation {
    private ArrayList<Message> listMessageData;
    public Conversation(){
        listMessageData = new ArrayList<>();
    }

    public ArrayList<Message> getListMessageData() {
        return listMessageData;
    }

}
