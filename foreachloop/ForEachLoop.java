package foreachloop;

public class ForEachLoop {

	public static void main(String[] args) {
		int nums[][]= {{1,2},{3,4},{5,6},{7,8}};
		int sum=0;
		
		for(int a[]:nums)
		{
			for(int x:a)
			{
			sum +=x;
			}
		}
		System.out.println("Total sum is:"+sum);

	}

}
