package project;

public class string {

	public static void main(String[] args) {
		String s = "Hello World";    
        int count = 0;   
        for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) != ' ')    
                count++; 
        }
        System.out.println("Total number of characters in the string: " + count);   
	}

}
