import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b;
		System.out.println("입력할 수 : ");
		Scanner scanner=new Scanner(System.in);
		String s1,s2;
		s1=scanner.next();
		s2=scanner.next();
		
		
		
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		
		System.out.println(a+" "+b);
		System.out.printf("a와 b의 합은 %d입니다.", a+b);
	}

}
