package com.stuv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        showMenu();
        Scanner sc = new Scanner(System.in);

        //boolean isExit = false;
        ArrayList<Student> stuList = new ArrayList<>();
        while(true){
            int flag = sc.nextInt();
            switch (flag){
                case 1:
                    login(stuList);
                    break;
                case 2:
                    stuList = signup(stuList);
                    break;
                case 3:
                    stuList = forgetPassword(stuList);
                    break;
                case 4:
                    System.out.println("退出......");
                    System.exit(0);
                default:
                    System.out.println("没有该功能，请重新输入");
            }
            showMenu();
        }

    }
    public static void showMenu(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
    }
    public static ArrayList<Student> signup(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = sc.next();
        // 用户名唯一
        for(int i = 0; i < list.size(); i++){
            if(name.equals(list.get(i).getName())){
                System.out.println("用户已存在，不能重复注册");
                return list;
            }
        }
        // 用户名长度在3~15，数字和字母组合、不能是纯数字。
        int namelen = name.length();
        if(3 > namelen || 15 < namelen){
            System.out.printf("用户名长度为 %s，大于15或小于2",namelen);
            return list;
        }
        if(charAndNum(name, namelen)) {
            System.out.println("字母和数字组合");
            if (!isAllNumber(name, namelen)) {
                System.out.println("不全是数字");
            }
            else{
                System.out.println("ERROR 全为数字");
                return list;
            }
        }
        else {
            System.out.println("用户名检测未通过");
            return list;
        }
        System.out.println("输入密码");
        String password = sc.next();
        System.out.println("再次输入密码");
        String password2 = sc.next();
        if(password.equals(password2)){
            System.out.println("密码验证成功");
        }
        else {
            System.out.println("两次密码输入不一致");
            return list;
        }
        System.out.println("输入身份证号");
        String id = sc.next();
        if(id.length() == 18){
            if(isAllNumber(id, 18)){
                System.out.println("身份证号18位数字，检测通过");
            }
            else if(isAllNumber(id, 17) && (id.charAt(17) == 'x' || id.charAt(17) == 'X' ))
            {
                System.out.println("身份证号17位数字+x/X，检测通过");
            }
            else{
                System.out.println("身份证号检测未通过");
                return list;
            }
        }
        else {
            System.out.println("身份证应为18位");
            return list;
        }
        System.out.println("输入手机号");
        String phonenumber = sc.next();
        if(phonenumber.length() == 11 && phonenumber.charAt(0) != '0' && isAllNumber(phonenumber, 11)){
            System.out.println("手机号检测通过");
        }
        else{
            System.out.println("手机号检测未通过");
            return list;
        }

        list.add(new Student(name, password, id, phonenumber));
        System.out.println("注册成功！");
        return list;
    }
    public static boolean isAllNumber(String str, int len){
        char[] chs = str.toCharArray();
        boolean allNum = true;
        for(int i = 0; i < len; i++){
            //System.out.println(chs[i]);
            if(chs[i] < '0' || chs[i] > '9'){
                allNum = false;
            }
                //return false;
        }
        return allNum;
    }
    public static boolean charAndNum(String str, int len){
        char[] chs = str.toCharArray();
        for(int i = 0; i < len; i++){
            if(!(chs[i] >= '0' && chs[i] <= '9' || chs[i] >= 'a' && chs[i] <= 'z' ||chs[i] >= 'A' && chs[i] <= 'Z'))
                return false;
        }
        return true;
    }
    public static void login(ArrayList<Student> list){
        System.out.println("登录");
    }
    public static ArrayList<Student> forgetPassword(ArrayList<Student> list){
        System.out.println("忘记密码");
        return list;
    }
}
