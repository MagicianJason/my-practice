import java.util.Scanner;

public class ThreeHeShang{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数字：");
		int c = sc.nextInt();
		System.out.println("请确定下列三个数为您输的数值（1为确认，2为否认）：");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int f = sc.nextInt();
		int d = a > b ? a : b;
		int e = d > c ? d : c;
		System.out.println("按下1获取三个数字的最大值");
		int g = sc.nextInt();
		System.out.println("--------");
		System.out.println("最大值是：" + e);
	}
}