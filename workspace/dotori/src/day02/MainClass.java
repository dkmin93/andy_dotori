package day02;

public class MainClass {
	
	public static void main(String[] args) {
		
		//객체로 생성
		Tv tv = new Tv(); //new 키워드 다음에 오는 것이 생성자
		tv.power();
		tv.changeChannel(100);
		tv.power();
		
		Tv tv2 = new Tv(100);
		System.out.println(tv2.channel);
		
		Tv tv3 = new Tv("Lg", 10, true);
		
		
		
		
	}

}
