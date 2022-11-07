public class ValueDemo1 {
    // main方法，表示程序的入口
    public static void main(String[] args){
        /* 输出语句
        将括号内容输出 */
        System.out.println("Hello world");
        System.out.println(666);
        System.out.println(-777);
        System.out.println(1.93);
        System.out.println(-3.71);
        System.out.println('a');
        System.out.println(true);
        System.out.println("null");
        System.out.println("name" + '\t' + "age");
        System.out.println("Tim" + '\t'+'\t' + "23");

        // 定义变量,变量不能重复定义，在使用前必须赋值
        int a = 10;
        System.out.println(++a);
        float b=10;
        System.out.println(a+b);
        int c=20,d=30;
        System.out.println(c);

        byte by1 = 10;
        System.out.println(by1);
        short sh1 = 20;
        int int1 = 30;
        long lg1 = 1235L;  // long型需要在数值后加 L 或者 l
        float f1 = 10.1F;
        double d1 = 20.2;
        char ch = '中';
        boolean fl = true;

        String name = "lyc";
        int age = 18;
        char gender = '男';
        double height = 175.1;
        boolean flag = false;
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);



    }
}
