public class qie {
	public static void main(String[]args){
		long a = 1;
		long b = 2;
		long c = 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for (int i = 1 ; i <= 30 ; i++){
			a = b + c ;
			System.out.println(a);
			b = a + c ;
			System.out.println(b);
			c = a + b ;
			System.out.println(c);
		}
	}
}