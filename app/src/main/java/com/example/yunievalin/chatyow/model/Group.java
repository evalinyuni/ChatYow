package com.example.yunievalin.chatyow.model;

/**
 * Created by yunievalin on 30/10/17.
 */

public class Group extends Room{
    public String id;
    public ListFriend listFriend;

    public Group(){
        listFriend = new ListFriend();
    }
}
