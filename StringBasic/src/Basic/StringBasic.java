package Basic;


public class StringBasic {
    public static void main(String args[]) {
    	String name="Dipak";        //String litral or String class.
    	String str=new String("Im dipak narkhede"); 
    	//String object using new keyword.
    	System.out.println(name);
    	System.out.println(str);
    	
    	String s="dnekdmdkfsmcdsfcndksfc";
    	System.out.println("Length of character in String is:");
    	System.out.println(s.length());
    	System.out.println(" character value At :");
        System.out.println(s.charAt(10));   //The Java String class charAt() method returns a char value at the given index number.
        //indexOf Method
        System.out.println("First occurance of character is:");
        System.out.println(s.indexOf('e'));
         //returns the index of the first occurrence of the specified character/string
        //returns -1 if the specified character/string is not found.
        
        //split() Method 
        //divides the string at the specified regex and returns an array of substrings.
        
    }
}
//Strings are immutable:-it cannot be changed once created.
