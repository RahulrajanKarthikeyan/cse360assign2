
/* Name - Rahulrajan Karthikeyan
* class - cse360 ( wed : 9:40 am to 10:30 am )   
*/  

package cse360assign2;
   
public class AddingMachine {

	private int total;
	
	private String valueStr = "0" ;   
	
	/* intitalised to return string with all symbols and values addded or subtracted to total 
	*/
        
        /*
         * 
         * AddingMachine () - not needed - included for clarity
         * getTotal () - returning total 
         * add (int value) - here we are adding value to total and also adding value to string 
         * subtract (int value) - here we are subtracting value to total and also adding value to string
         * toString () - to return string with all symbols and values addded or subtracted to total
         * clear()  - to clear the string 
         * 
         */

	public AddingMachine () {
		total = 0;  
	}
	
	public int getTotal () {
		return total ;                  
	}
	
	public void add (int value) {
		total = total + value ; 
		valueStr = valueStr + "+" + value ;   
	}
	
	public void subtract (int value) {
		total = total - value ; 
		valueStr = valueStr + "-" + value ;    
	}
		
	public String toString () {
		return valueStr ;           
	}

	public void clear() {
	    
	    valueStr = "0" ;  
	
	}
}
