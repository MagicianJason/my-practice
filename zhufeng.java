public class zhufeng {
	public static void main(String[]args){
		int ci = 0;
		double paper = 0.1;
		int zf = 8848000;
		while(paper <= zf) {
			paper *= 2;
			ci++;
		}
		System.out.println("��Ҫ���۵Ĵ����ǣ�"+ ci +"��");
	}
}