import java.util.Scanner;

public class if1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ӣ����ʦ������ID����ʱû��������ȡ���������Ժ��ϸ�֡���");
		int x = sc.nextInt();
		System.out.println("С����ĩ�����ˣ�������������ʦ����Ҫ�������ٷ��أ�");
		System.out.println("��������������ķ֣�������0-100����Ȼ���вʵ���");
		int chinese = sc.nextInt();
		if (chinese > 100 || chinese < 0){
		System.out.println("С������ʦ������ǲ����е�ë����");
		} else if (chinese <=100 && chinese >= 95){
			System.out.println("С�����ۣ���������ô����");
			System.out.println(x + ":�´��ټ���");
		} else if (chinese <= 94 && chinese >= 90){
			System.out.println("С�������û������");
			System.out.println(x + ":��ס����ס��");
		} else if (chinese <= 89 && chinese >= 80){
			System.out.println("С������ƽʱһ�������ܽ�����");
			System.out.println(x + ":���Ŭ������90��");
		} else if (chinese <= 79 && chinese >= 70){
			System.out.println("С�������˰ű�Q�������������ˡ�");
			System.out.println(x + ":���զ����ô���С������������Ұ칫�ҡ�");
		} else if (chinese <= 69 && chinese >= 60){
			System.out.println("С�������˻�û��70Ҫ���ˣ�");
			System.out.println(x + "(���εģ�)" + ":......");
			System.out.println("��óɾ�:������ʦ������");
		} else {
			System.out.println("С��������������û��������");
			System.out.println(x + ":�������ҳ���ϵ�ң�������̸����");	
			System.out.println("�ɾͣ������⡣");			
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("С����ĩ�����ˣ���������ѧ��ʦ����Ҫ�������ٷ��أ�");
		System.out.println("��������������ķ֣�������0-100����Ȼ���вʵ���");
		chinese = sc.nextInt();
		if (chinese > 100 || chinese < 0){
		System.out.println("С������ʦ������ǲ����е�ë����");
		} else if (chinese <=100 && chinese >= 95){
			System.out.println("С����������6���ð�");
			System.out.println(x + ":���ܽ�����");
		} else if (chinese <= 94 && chinese >= 90){
			System.out.println(x + ":���û֮ǰ��ѽ����ô���£�");
			System.out.println("С������ѽ�´�һ����");
		} else if (chinese <= 89 && chinese >= 80){
			System.out.println("С�����������ҿ������ҡ�");
			System.out.println(x + ":������ˢ����Ӵ����������֡�");
		} else if (chinese <= 79 && chinese >= 70){
			System.out.println("С�����ⲻ���ҵ��Ծ�ɣ�����");
			System.out.println(x + ":���զ���İ����������Ұ칫�ҡ�");
			System.out.println("��ȥ�˺þúþã���֪����á�");
			System.out.println("С�����ŴӰ칫�ҳ�����");
		} else if (chinese <= 69 && chinese >= 60){
			System.out.println("С������Ҫ���ˣ��ҵ���ѧզ�������ˣ�����");
			System.out.println(x + "�������̫���񣬿���ô������");
		} else {
			System.out.println("С��������������û����������ѧ");
			System.out.println("С��ԭ���ε�");	
			System.out.println("�ɾͣ��ε�......");
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("С����ĩ�����ˣ�������Ӣ����ʦ����Ҫ�������ٷ��أ�");
		System.out.println("��������������ķ֣�������0-100����Ȼ���вʵ���");
		chinese = sc.nextInt();
		if (chinese > 100 || chinese < 0){
		System.out.println("С������ʦ������ǲ����е�ë����");
		} else if (chinese <=100 && chinese >= 95){
			System.out.println("С������ֱ�����漣��");
			System.out.println(x + ":�������ⲻ��С���𣿼��첻����ô�����ˡ�");
		} else if (chinese <= 94 && chinese >= 90){
			System.out.println(x + "�н�������");
			System.out.println("С��:�ߺ����Ⲩ�о������ԡ�");
		} else if (chinese <= 89 && chinese >= 80){
			System.out.println("С��������ˮƽ����������������");
			System.out.println(x + ":������������״���ټӼ��͡�");
		} else if (chinese <= 79 && chinese >= 70){
			System.out.println("С����......");
			System.out.println(x + ":.....");
			System.out.println("......");
			System.out.println("��óɾͣ�......");
		} else if (chinese <= 69 && chinese >= 60){
			System.out.println("С��������ûд��ɡ�");
			System.out.println(x + "�����ǲ�������д��ʲô��д��һ��Ѳ����֡�");
		} else {
			System.out.println("С���������ˣ������й���û���ˣ�����");
			System.out.println(x + "����˵�㡣");	
			System.out.println("�ɾͣ�...�й���...");
		}	
	}
}