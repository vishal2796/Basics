package queueInt;

public class QueueInt {
	int nums[];
	int putloc, getloc;
	
	public QueueInt(int size)
	{
		nums=new int[size];
		putloc=getloc=0;
	}
	void put(int x)
	{
		if(putloc==nums.length)
		{
			System.out.println("Queue is full");
			return;
		}
		nums[putloc++]=x;
	}
	int get()
	{
		if(getloc==putloc)
		{	System.out.println("Queue is null.");
			return 0;
		}
		return nums[getloc++];
	}
}
