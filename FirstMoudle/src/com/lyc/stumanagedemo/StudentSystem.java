package com.lyc.stumanagedemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("------------Welcome-------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose =  sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出系统");
//                    break loop;
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    // 添加学生
    public static void addStudent(ArrayList<Student> list){
        Student s = new Student();
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id:");
            String id = sc.next();
            boolean flag = contains(list,id);
            if(flag){
                System.out.println("id已经存在！！");
            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生的住址：");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("添加成功！！");


    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list){
        // System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的ID：");
        String id = sc.next();
        int idx = getIndex(list,id);
        if (idx >= 0){
            list.remove(idx);
            System.out.println("id为" + id + "已经删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }


    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的ID：");
        String id = sc.next();
        int idx = getIndex(list,id);

        if(idx == -1){
            System.out.println("要修改的id不存在！！！");
            return;
        }

        Student stu = list.get(idx);

        System.out.println("请输入修改后的姓名：");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入修改后的年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入修改后的家庭住址：");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("修改成功！！");
    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)){
                return true;
            }
        }
        return false;
    }

    // 通过id获取索引
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if (sid.equals(id)){
                return i;
            }
        }
        return -1;
    }

}
