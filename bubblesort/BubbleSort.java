package bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,2,8,5,9,12,11,6};
		int temp;
		
		for(int i=1;i<8;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(arr[j+1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("The sorted list is: ");
		for(int i=0;i<8;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		

	}

}
