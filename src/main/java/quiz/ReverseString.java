package quiz;

public class ReverseString {
    public String reverse(String input) {
    	if (input == null) return ""; //If null string, return empty one
    	
        StringBuilder sb = new StringBuilder();
        
        for (int i = input.length() - 1; i >= 0; i--)
        	sb.append(input.charAt(i)); //Build the string in reverse
        
    	return sb.toString();
    }
}