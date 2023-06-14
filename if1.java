import java.util.Scanner;

public class if1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入语数英；老师的数字ID（暂时没能力让你取中文名，以后会细分。）");
		int x = sc.nextInt();
		System.out.println("小明期末考试了，你是他语文老师，你要给他多少分呢？");
		System.out.println("请输入您想给他的分（尽量在0-100，不然会有彩蛋）");
		int chinese = sc.nextInt();
		if (chinese > 100 || chinese < 0){
		System.out.println("小明：老师我这分是不是有点毛病？");
		} else if (chinese <=100 && chinese >= 95){
			System.out.println("小明：哇，我语文这么棒！");
			System.out.println(x + ":下次再加油");
		} else if (chinese <= 94 && chinese >= 90){
			System.out.println("小明：考得还不错嘛。");
			System.out.println(x + ":稳住保持住。");
		} else if (chinese <= 89 && chinese >= 80){
			System.out.println("小明：和平时一样，还能进步。");
			System.out.println(x + ":多多努力能上90。");
		} else if (chinese <= 79 && chinese >= 70){
			System.out.println("小明：完了芭比Q了完了完了完了。");
			System.out.println(x + ":这次咋考这么差啊？小明？待会儿来我办公室。");
		} else if (chinese <= 69 && chinese >= 60){
			System.out.println("小明：废了还没有70要噶了！");
			System.out.println(x + "(无奈的：)" + ":......");
			System.out.println("获得成就:来自老师的无奈");
		} else {
			System.out.println("小明：啊啊啊，格没及！！！");
			System.out.println(x + ":明天叫你家长联系我，咱慢慢谈啊。");	
			System.out.println("成就：竹笋炒肉。");			
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("小明期末考试了，你是他数学老师，你要给他多少分呢？");
		System.out.println("请输入您想给他的分（尽量在0-100，不然会有彩蛋）");
		chinese = sc.nextInt();
		if (chinese > 100 || chinese < 0){
		System.out.println("小明：老师我这分是不是有点毛病？");
		} else if (chinese <=100 && chinese >= 95){
			System.out.println("小明：基操勿6，好吧");
			System.out.println(x + ":不能骄傲。");
		} else if (chinese <= 94 && chinese >= 90){
			System.out.println(x + ":这次没之前好呀，怎么回事？");
			System.out.println("小明：哎呀下次一定。");
		} else if (chinese <= 89 && chinese >= 80){
			System.out.println("小明：看不见我看不见我。");
			System.out.println(x + ":哎，多刷点题哟，考个这个分。");
		} else if (chinese <= 79 && chinese >= 70){
			System.out.println("小明：这不是我的试卷吧！！！");
			System.out.println(x + ":这次咋考的啊？现在来我办公室。");
			System.out.println("过去了好久好久，不知道多久。");
			System.out.println("小明哭着从办公室出来。");
		} else if (chinese <= 69 && chinese >= 60){
			System.out.println("小明：不要活了！我的数学咋成这样了！！！");
			System.out.println(x + "：考你个太八神，考过么发力分");
		} else {
			System.out.println("小明：啊啊啊，格没及，还是数学");
			System.out.println("小明原地晕倒");	
			System.out.println("成就：晕倒......");
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("小明期末考试了，你是他英语老师，你要给他多少分呢？");
		System.out.println("请输入您想给他的分（尽量在0-100，不然会有彩蛋）");
		chinese = sc.nextInt();
		if (chinese > 100 || chinese < 0){
		System.out.println("小明：老师我这分是不是有点毛病？");
		} else if (chinese <=100 && chinese >= 95){
			System.out.println("小明：简直就是奇迹！");
			System.out.println(x + ":呦呦呦这不是小明吗？几天不见这么厉害了。");
		} else if (chinese <= 94 && chinese >= 90){
			System.out.println(x + "有进步哈。");
			System.out.println("小明:芜湖，这波感觉还阔以。");
		} else if (chinese <= 89 && chinese >= 80){
			System.out.println("小明：正常水平可以啦可以啦。。");
			System.out.println(x + ":不能满足于现状，再加加油。");
		} else if (chinese <= 79 && chinese >= 70){
			System.out.println("小明：......");
			System.out.println(x + ":.....");
			System.out.println("......");
			System.out.println("获得成就：......");
		} else if (chinese <= 69 && chinese >= 60){
			System.out.println("小明：我是没写完吧。");
			System.out.println(x + "：真是不晓得你写个什么，写了一大堆才这点分。");
		} else {
			System.out.println("小明：嗨嗨嗨，我是中国人没错了！！！");
			System.out.println(x + "懒得说你。");	
			System.out.println("成就：...中国人...");
		}	
	}
}