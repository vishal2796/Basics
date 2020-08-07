package arraysstroingref;

public class Test {

	public static void main(String[] args) {
		
		ArraysStoringRef arr= new ArraysStoringRef();
		arr.setname("Bert");
		String dog1= arr.getname();
		System.out.println("First Dog's name is "+dog1);
		
		// Now with ARRAY storing References
		
		ArraysStoringRef[] array= new ArraysStoringRef[3];
		// Assigning objects to sub arrays storing References
		
		array[0]= new ArraysStoringRef();
		array[1]= new ArraysStoringRef();
		array[2]= arr;
		
		//Assigning values to objects
		array[0].setname("Bella");
		String dog2= array[0].getname();
		System.out.println("Second Dog's name is "+dog2);
		array[1].setname("Billu");
		String dog3= array[1].getname();
		System.out.println("Third Dog's name is "+dog3);
		
		String dog4= array[2].getname();
		System.out.println("Third Dog's name is "+dog4);
		
		
	}

}
