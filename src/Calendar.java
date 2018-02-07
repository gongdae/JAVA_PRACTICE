import java.util.Scanner;

public class Calendar {
	private static final int[] monthlist= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysOfMonth(int month)
	{		
		return monthlist[month-1];
	}
	public static void main(String[] args)
	{
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 받아서 해당 달의 최대일수 출력
		System.out.println("원하는 달을 입력하세요 : ");
		Scanner scanner=new Scanner(System.in);
		Calendar cal=new Calendar();
		int month=scanner.nextInt();
		scanner.close();
		
		System.out.println(cal.getMaxDaysOfMonth(month)+"입니다");
		
	}
}
