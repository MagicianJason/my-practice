public class ShuiXianHua {
	public static void main(String[]args){
		int shu = 0;
		for(int i = 100; i < 1000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i ){
				System.out.println(i);
				shu++;
			}
		}
		System.out.println("水仙花的个数是："+ shu +"个");
	}
}