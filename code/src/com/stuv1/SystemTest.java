package com.stuv1;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("-----------------welcome-------------------------------");
        //showMemu();
        ArrayList<Student> stuList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            showMemu();
            System.out.print("输入选择按钮\n");
            int flag = sc.nextInt();
            boolean isExit = false;
            switch (flag){
                case 1:
                    stuList = addStu(stuList);
                    break;
                case 2:
                    stuList = deleteStu(stuList);
                    break;
                case 3:
                    stuList = updateStu(stuList);
                    break;
                case 4:
                    searchStu(stuList);
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("没有该功能，请重新输入");
            }
            if (isExit) {
                System.out.println("退出......");
                System.exit(0);
               // break;
            }
        }
    }
    public static void showMemu(){
        System.out.println("-------------------------------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("您可以通过输入数字选择操作项.");
        System.out.println("-------------------------------------");
    }
    public static ArrayList<Student> addStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("input id: ");
        int id = sc.nextInt();
        System.out.print("input name: ");
        String name = sc.next();
        System.out.print("input age: ");
        int age = sc.nextInt();
        System.out.print("input home address: ");
        String homeAddr = sc.next();
        Student s = new Student(id, name, age, homeAddr);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                System.out.println("ERROR：已存在该 ID");
                return list;
            }
        }
        list.add(s);
        System.out.printf("添加学号为 %s 的学生成功！\n",id);
        return list;
    }
    public static ArrayList<Student> deleteStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要删除学生的id ");
        int id = sc.nextInt();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                System.out.printf("成功删除学号为 %s 的学生！\n", id);
                list.remove(i);
                return list;
            }
        }
        System.out.println("ERROR：未找到该学生id");
        return list;
    }
    public static ArrayList<Student> updateStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要修改信息的学生id");
        int id = sc.nextInt();
        for(int i = 0; i < list.size(); i++ ){
            if(list.get(i).getId() == id){
                System.out.printf("find it!");
                System.out.print("input name: ");
                String name = sc.next();
                System.out.print("input age: ");
                int age = sc.nextInt();
                System.out.print("input home address: ");
                String homeAddr = sc.next();
                list.get(i).setName(name);
                list.get(i).setAge(age);
                list.get(i).setHomeAddr(homeAddr);
                return list;
            }
        }
        System.out.println("没有该学生，请重新输入");
        return list;
    }
    public static void searchStu(ArrayList<Student> list){
//        Scanner sc = new Scanner(System.in);
        System.out.println("输入要查询的学生id");
//        int id = sc.nextInt();
        if(list.size() == 0)
            System.out.println("当前无学生信息，请添加后在查询");
        else{
            System.out.printf("id\t\t name\t\t age\t homeAddr\t\t\n");
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                System.out.printf("%s\t %s\t %s\t %s\t\n", s.getId(), s.getName(), s.getAge(),s.getHomeAddr());
            }
        }
    }
}
