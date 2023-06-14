public class zhufeng {
	public static void main(String[]args){
		int ci = 0;
		double paper = 0.1;
		int zf = 8848000;
		while(paper <= zf) {
			paper *= 2;
			ci++;
		}
		System.out.println("需要对折的次数是："+ ci +"次");
	}
}