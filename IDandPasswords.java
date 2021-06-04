package com.company;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Raung","soto");
        logininfo.put("Mikha","Password");
        logininfo.put("Irzah","cantik");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
