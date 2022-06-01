
public class Calculator {
	
	public int add(int a , int b) { //integer data type of the variable in the parameters
		//add in the items
		return a + b; //return the a addition b results
	}
	
	public int subtract(int a , int b ) { // integer data type of the variable in the parameter are integer
		//subtract the items
		return a - b; //return the a subtract b results
	}
	
	public int mutiply(int a , int b) { //integer data type of the variable in parameter are integer
		//multiply the items
		return a *b; //return the a multiply by b values
	}
	public int divide (int a , int b) { //integer data type for variable in the parameter add in int a and int b
		//divide a and b
		if(b == 0) { //a can be zero , b cannot be zero because it is the denominator 
			throw new IllegalArgumentException("Divison by zero is not supported"); //use throw new exception method 
		}
		return a/b; //return the value of a divide by b , so the value would be shown as output
	}

}
