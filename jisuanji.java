import java.util.Scanner;

public class jisuanji{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��λ���Ӽ��˳���");
		System.out.println("�����һ�����֣�");
		int a = sc.nextInt();
		System.out.println("��������1Ϊ+ 2Ϊ- 3Ϊ* 4Ϊ/ 5Ϊ%��");
		int b = sc.nextInt();
		System.out.println("����ڶ������֣�");
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
			System.out.println("��������");
			break;			
		}
	}
}