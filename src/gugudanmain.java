import java.util.Scanner;

public class gugudanmain {
	public static void main(String[] args){
		
		int[] gugudan=new int[9];
		
		System.out.println("숫자 2개 입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(sp2litedValue[1]);
		
		gugudan=gugudan2.caculate(first);
		gugudan2.print(gugudan, second);
	}
}
