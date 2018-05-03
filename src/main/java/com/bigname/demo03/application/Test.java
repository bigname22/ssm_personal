package com.bigname.demo03.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    // 存儲用戶
    private static List<User> userArr = new ArrayList();

    public static void main(String args[]) {
        start();
    }

    public static void start() {
        Scanner sn = new Scanner(System.in);
        System.out.println("1：登陸，2：注冊");
        int next = sn.nextInt();
        if (next == 1) {
            // 登陸
            System.out.println("輸入用戶名");
            String nameStr = sn.next();
            System.out.println("輸入密碼");
            String passStr = sn.next();

            // 檢驗
            boolean isHaveName = false;
            boolean isPassTrue = false;
//            User userTemp = new User();
            String result = "登錄失敗";
            for(int i=0;i<userArr.size();i++) {
                User user = userArr.get(i);
                if (user.getName().equals(nameStr)) {
                    if (user.getPass().equals(passStr)) {
                        result = "登陸成功";
                    }
                }
            }
            System.out.println(result);
            start();


        }else{
            // 注冊
            System.out.println("輸入用戶名");
            String nameStr = sn.next();
            System.out.println("輸入密碼");
            String passStr = sn.next();

            User user = new User(nameStr, passStr);

            userArr.add(user);

            for(int i=0;i<userArr.size();i++) {
                System.out.println(userArr.get(i));
            }
            start();
        }
    }

    static class User {
        String name;
        String pass;
        public User(){}

        public User(String name, String pass) {
            this.name = name;
            this.pass = pass;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", pass='" + pass + '\'' +
                    '}';
        }
    }
}
