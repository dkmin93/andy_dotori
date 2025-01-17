package day01;

public class Example01 {
	
	public static void main(String[] args) {
		
		//형변환
		//데이터 타입의 크기
		// byte < short < int < long < float < double
		
		//작은 타입을 큰 타입에 넣을 때는 자동으로 형변환 해준다
		byte a = 1;
		double d= a; //자동 형변환
		System.out.println(d);
		
		//큰 타입을 작은 타입에 넣을 때
		int i = (int)d;
		
		long l = 10L;
		int j = (int)l;
		
		System.out.println("==============================");
		
		//연산이 일어날 때, 형변환
		//1. 서로 다른 타입 형변환에서는 큰 타입을 따라간다.
		//2. int 보다 작은 타입의 연산에서는 int가 된다.
		
		char c1 = 'A';
		int i1 = 2;
		System.out.println(c1+i1); // A의 아스키 코드값은 65 65+2=67
		System.out.println((char)(c1+i1)); //캐스팅해서 C가나옴 C의 아스키코드값은 67

		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		//컴퓨터는 32bit,64bit 계산밖에 못한다 1 byte는 8 bit다
		//그래서 byte + byte를 계산하기 위해서 byte를 32비트인 int로 자동형변환되서 int값이 나온다.
		
		int score = 532;
		int size = 5;
		System.out.println((double)(score / size)); // 결과값을 더블로 캐스팅 해봐야 이미 소숫점 이하 값이 없으므로
		System.out.println((double)score / size); // 한 쪽을 더블로 미리 캐스팅해야 소숫점 값이 나온다
		
	
	
	}

}
