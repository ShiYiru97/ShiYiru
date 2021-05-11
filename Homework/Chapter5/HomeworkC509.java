/*定义Music类 里面有音乐名，音乐时长times属性
并有播放play功能和返回本身属性信息的功能方法 getInfo*/
public class HomeworkC509{
	public static void main(String[] args) {
		Music mus = new Music();
		mus.getInfo("长歌行","04:51");
	}
}
class Music{
	String name;
	String times;
	// public void play(???)
	// 没写完！！！！


	public String getInfo(String name,String times){
		this.name = name;
		this.times = times;
		System.out.println(this.name + "的时长为 " + this.times);
	}
}
