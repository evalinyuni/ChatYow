package com.example.yunievalin.chatyow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunievalin on 30/10/17.
 */

public class Room {
    public ArrayList<String> member;
    public Map<String, String> groupInfo;

    public Room(){
        member = new ArrayList<>();
        groupInfo = new HashMap<String, String>();
    }
}
