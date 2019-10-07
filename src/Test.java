class Test { 
	
// class contents 
void show() 
{ 
	System.out.println("Test::show() called"); 
} 
} 

 class Main { 
	
	// Driver Code 
	public static void main(String[] args) 
	{ 
		
		// all objects are dynamically 
		// allocated 
		Test t = new Test(); 
		t.show(); // No error 
	} 
} 
