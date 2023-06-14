import java.util.Scanner;

public class switch1{
	public static void main(String[]arngs){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x){
			case 1 :
			System.out.println("输入了数字一");
			break;
			case 2 :
			System.out.println("输入了数字二");
			break;
			case 3 :
			System.out.println("输入了数字三");
			break;
			case 4 :
			System.out.println("输入了数字四");
			break;
			case 5 :
			System.out.println("输入了数字五");
			break;
			case 6 :
			System.out.println("输入了数字六");
			break;
			case 7 :
			System.out.println("输入了数字七");
			break;
			case 8 :
			System.out.println("输入了数字八");
			break;
			case 9 :
			System.out.println("输入了数字九");
			break;
			case 0 :
			System.out.println("输入了数字零");
			break;
			default :
			break;
		}
	}
}