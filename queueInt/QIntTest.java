package queueInt;

public class QIntTest {

	public static void main(String[] args) {
		QueueInt bigQ= new QueueInt(20);
		QueueInt smallQ= new QueueInt(5);
		
		for(int i=0;i<20;i++)
		{
			bigQ.put(i);
		}
		for(int i=0;i<20;i++)
		{
			int a=bigQ.get();
			System.out.println("Queue is: "+a);
		}
		

	}

}
