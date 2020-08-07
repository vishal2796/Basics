package array;

public class MinMax {

	public static void main(String[] args) {
		int arr[]= new int[5];
		int min, max;
		arr[0]=32;
		arr[1]=24;
		arr[2]=3;
		arr[3]=53;
		arr[4]=50;
		
		min=max=arr[0];
		for(int i=0;i<5;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The Min element is:"+min+" and Max is:"+max);
	}

}
