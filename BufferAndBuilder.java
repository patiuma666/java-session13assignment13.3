//here I'm trying to show how the capacity of a string buffer or string builder change if we use append

package assignment13; //created a package of assignment13


public class BufferAndBuilder {//here created a class BufferAndBuilder
	
public static void main(String[] args) { //here created the main method
		
		//String Buffer and String builder have same method, but there is one difference between them. that is 
		// StringBuffer is synchronized that is thread safe. so, whenever you are working with thread then use
		// String buffer.
		
		StringBuffer buffer=new StringBuffer("Uma Maheshwari"); //here created StringBuffer with variable buffer
		
		
		
		System.out.println("It gives the ouput has : " +buffer);  //it prints the string  
		System.out.println("The length is : "+buffer.length());   //here it prints the length of the string which is 14
		System.out.println("Capacity is : "+buffer.capacity());// here first the default  capacity is 16 and it adds to the given string capacity
		
		buffer.append(" The student of ACADGILD");    //this used to append the specified string with this string      
				
		System.out.println(buffer);
		System.out.println("The length is : "+buffer.length());//here the length will be 37
		System.out.println("Capacity is : "+buffer.capacity()); //now its capacity will become 62
		
		buffer.append(" Is here to Learn, Do and Earn");
		
		System.out.println("Capacity is : "+buffer.capacity()); //gives the capacity of 126
		
		System.out.println(buffer);
		System.out.println("The length is : "+buffer.length()); //gives the length of 67
		System.out.println("Capacity is : "+buffer.capacity());// here it shows like now (62*2)+2=126 i.e (old capacity*2)+2
		//this is how the append uses the capacity of string buffer or string builder
		
	}

}






