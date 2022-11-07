import java.util.Scanner;

public class ScannerDemo1 {
    // main方法，表示程序的入口
    public static void main(String[] args){
        // 创建对象
        Scanner sc = new Scanner(System.in);
        // 接收数据
        System.out.println("请输入第一个整型数据：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整型数据：");
        int num2 = sc.nextInt();

        System.out.println("两者之和为：");
        System.out.println(num1+num2);

    }
}
