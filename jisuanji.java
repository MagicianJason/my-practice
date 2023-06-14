import java.util.Scanner;

public class jisuanji{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("两位数加减乘除法");
		System.out.println("输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("输入数字1为+ 2为- 3为* 4为/ 5为%：");
		int b = sc.nextInt();
		System.out.println("输入第二个数字：");
		int c = sc.nextInt();
		switch (b){
			case 1:
			System.out.println(a + c);
			break;
			case 2:
			System.out.println(a - c);
			break;
			case 3:
			System.out.println(a * c);
			break;
			case 4:
			System.out.println(a / c);
			break;
			case 5:
			System.out.println(a % c);
			break;
			default:
			System.out.println("数据有误");
			break;			
		}
	}
}