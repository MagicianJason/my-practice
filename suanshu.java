public class suanshu{
	public static void main(String[]args){
		//�����ǼӼ��˳�������롣
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(c);
		System.out.println(a + b * c);
		System.out.println("--------");
		//�������Զ�����ת����ǿ������ת���Ĵ��롣
		double d = 10;
		int e = (int)10.20;
		System.out.println(d);
		System.out.println(e);
		//�������ַ���������ַ���������Ĵ��롣
		char f = 'A';
		System.out.println(f + a);
		System.out.println("magician" + a + b);
		System.out.println(a + b + "magician");
		System.out.println("magician "+ "is " + "good");
		System.out.println("--------");
		//System.out.println("magician");System.out.println("is");System.out.println("good");
		//�������������cmd�����Զ����е�
		/*������
		magician
		is
		good
		������magician is the good
		*/
		System.out.println("magician");System.out.println("is");System.out.println("good");
		System.out.println("--------");
		//�����Ǹ�ֵ������Ĵ��롣
		a += 20;
		System.out.println(a);
		a -= 5;
		System.out.println(a);
		a *= 10;
		System.out.println(a);
		a /= 10;
		System.out.println(a);
		a %= 3;
		System.out.println(a);
		System.out.println("--------");
		//�����Լ�����Ĵ��롣
		int i = 10;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		System.out.println("--------");
		//���ǹ�ϵ������Ĵ��롣
		int g = 10;
		int h = 20;
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(i == g);
		System.out.println(i == h);
		System.out.println(i != g);
		System.out.println(i != h);
		System.out.println(i > g);
		System.out.println(i > h);
		System.out.println(i >= g);
		System.out.println(i >= h);
		System.out.println(i < g);
		System.out.println(i < h);
		System.out.println(i <= g);
		System.out.println(i <= h);
		System.out.println("--------");
		//�߼�������Ĵ��롣
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a > b & a > b); //false & false
		System.out.println(a < b & a > b); //true & false
		System.out.println(a > b & a < b); //false & true
		System.out.println(a < b & a < b); //ture & ture
		System.out.println("--------");
		System.out.println(a > b | a > b); //false & false
		System.out.println(a < b | a > b); //true & false
		System.out.println(a > b | a < b); //false & true
		System.out.println(a < b | a < b); //ture & ture
		System.out.println("--------");
		System.out.println(a > b ^ a > b); //false & false
		System.out.println(a < b ^ a > b); //true & false
		System.out.println(a > b ^ a < b); //false & true
		System.out.println(a < b ^ a < b); //ture & ture
		System.out.println("--------");
		//��֪��Ϊʲô���ò���
		//System.out.println(! a < b);
		//System.out.println(!! a < a);
		//
	}
}