public class suanshu{
	public static void main(String[]args){
		//这里是加减乘除运算代码。
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
		//这里是自动类型转换和强制类型转换的代码。
		double d = 10;
		int e = (int)10.20;
		System.out.println(d);
		System.out.println(e);
		//这里是字符运算符和字符串运算符的代码。
		char f = 'A';
		System.out.println(f + a);
		System.out.println("magician" + a + b);
		System.out.println(a + b + "magician");
		System.out.println("magician "+ "is " + "good");
		System.out.println("--------");
		//System.out.println("magician");System.out.println("is");System.out.println("good");
		//这样打出来后在cmd中是自动分行的
		/*像这样
		magician
		is
		good
		而不是magician is the good
		*/
		System.out.println("magician");System.out.println("is");System.out.println("good");
		System.out.println("--------");
		//这里是赋值运算符的代码。
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
		//自增自减运算的代码。
		int i = 10;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		System.out.println("--------");
		//这是关系运算符的代码。
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
		//逻辑运算符的代码。
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
		//不知道为什么！用不了
		//System.out.println(! a < b);
		//System.out.println(!! a < a);
		//
	}
}