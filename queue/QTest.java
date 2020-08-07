package queue;

public class QTest {

	public static void main(String[] args) {
		Queue bigQ= new Queue(100);
		Queue smallQ= new Queue(4);
		char ch;
		int i;
		
		for(i=0;i<26;i++)
			bigQ.put((char)('A' + i));
		for(i=0;i<26;i++)
		{
			ch=bigQ.get();
			if(ch!=(char)0)
				System.out.println(ch);
		}
		
		for(i=0;i<4;i++)
		{
			smallQ.put((char)('M'+i));
		}
		
		for(i=0;i<4;i++)
		{
			ch=smallQ.get();
			if(ch!=(char)0)
				System.out.println(ch);
		}
	
	}

}
