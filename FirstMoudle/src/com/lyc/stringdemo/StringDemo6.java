package com.lyc.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
//        String phoneNum = "13112349468";
//        String  start = phoneNum.substring(0,3);
//        String end = phoneNum.substring(7);
//        String result = start + "****" + end;
//        System.out.println(result);

        // 身份信息提取
/*
        String idNum = "410322202005216216";
        String year =  idNum.substring(6,10);
        String month =  idNum.substring(10,12);
        String day =  idNum.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生日期：" + year + "年" + month + "月" + day + "日");
        char gender = idNum.charAt(16);
        if ((gender - 48)%2 == 0){
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
*/

        // 敏感词替换

        String talk = "SB你玩的真好，CNM,以后不要再玩了，TMD！";

        String [] arr = {"TMD","CNM","SB","MLGB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
//        String result = talk.replace("TMD","***");
        System.out.println(talk);

    }
}
