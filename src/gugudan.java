import java.util.Scanner;

public class gugudan {
	public static void main(String[] args)
	{
		int[] result=new int[9];
		for(int i=0;i<result.length;i++)
		{
			result[i]=(i+1)*2;
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
} 
