import java.util.Scanner;

public class ThreeHeShang{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		System.out.println("��������������֣�");
		int c = sc.nextInt();
		System.out.println("��ȷ������������Ϊ�������ֵ��1Ϊȷ�ϣ�2Ϊ���ϣ���");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int f = sc.nextInt();
		int d = a > b ? a : b;
		int e = d > c ? d : c;
		System.out.println("����1��ȡ�������ֵ����ֵ");
		int g = sc.nextInt();
		System.out.println("--------");
		System.out.println("���ֵ�ǣ�" + e);
	}
}