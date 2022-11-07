package com.lyc.classdemo;

public class ClassArrayTest {
    public static void main(String[] args) {
        /*
    定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号
    姓名各不相同。
    学生的属性:学号，姓名，年龄。
    要求1∶再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。要求2:添加完毕之后，遍历所有学生信息。
    要求3:通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。要求4:删除完毕之后，遍历所有学生信息。
    要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
    */
        ClassArray [] arr = new ClassArray[3];
        ClassArray stu1 = new ClassArray(1,"zhangsan",23);
        ClassArray stu2 = new ClassArray(2,"lisi",24);
        ClassArray stu3 = new ClassArray(3,"wangwu",25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        ClassArray stu4 = new ClassArray(4,"zhaoliu",26);
        boolean flag = contains(arr,stu4.getId());
        if (flag){
            System.out.println("当前id重复！！");
        } else {
            int count = getCount(arr);
            if (count==arr.length){
                ClassArray[] newArray = createNewArray(arr);
                newArray[count] = stu4;
                printArr(newArray);

            } else {
                arr[count] = stu4;
                printArr(arr);
            }

        }
        int index = getIndex(arr,4);
        if (index >= 0){
            arr[index] = null;
            printArr(arr);
        } else {
            System.out.println("error!!!");
        }

    }

    public static void printArr(ClassArray [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.println(arr[i].getId() + " " + arr[i].getName() +" "+arr[i].getAge());
            }
        }
    }

    public  static ClassArray [] createNewArray(ClassArray [] arr){
        ClassArray[] newArr = new ClassArray[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static  int getCount(ClassArray [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null ){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(ClassArray [] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                int sid = arr[i].getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getIndex(ClassArray [] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                if (arr[i].getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }
//    public static void deleteId(int index){
//
//    }


}
