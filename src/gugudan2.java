public class gugudan2 {
	public static int[] caculate(int times)
	{
		int[] result=new int[9];
		
		for(int i=0;i<result.length;i++){
			result[i]=(i+1)*times;
		}
		return result;
	}
	
	public static void print(int[] result){
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}	
	}
} 
