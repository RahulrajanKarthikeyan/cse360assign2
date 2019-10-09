package cse360assign2;

/* Name - Rahulrajan Karthikeyan
/ class - cse360 ( wed : 9:40 am to 10:30 am )   
*/  
   
   
public class AddingMachine {

	private int total;
	
	private String valueStr = "0" ;   
	
	/* intitalised to return string with all symbols and values addded or subtracted to total 
	*/
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total ;                  // returning total 
	}
	
	public void add (int value) {
		total = total + value ; 
		valueStr = valueStr + "+" + value ;   // here we are adding value to total and also adding value to string 
	}
	
	public void subtract (int value) {
		total = total - value ; 
		valueStr = valueStr + "-" + value ;   // here we are subtracting value to total and also adding value to string
	}
		
	public String toString () {
		return valueStr ;           // to return string with all symbols and values addded or subtracted to total
	}

	public void clear() {
	    
	    valueStr = "0" ;  // to clear the string 
	
	}
}
