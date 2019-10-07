//Java program to illustrate the  
//concept of single inheritance 
public class DiffInheritance
{ 
	 public static void main(String[] args) 
	 { 
	     two g = new two(); 
	     g.print_geek(); 
	     g.print_for(); 
	     g.print_geek(); 
	 } 
	} 


class one 
{ 
 public void print_geek() 
 { 
     System.out.println("Geeks"); 
 } 
} 

class two extends one 
{ 
 public void print_for() 
 { 
     System.out.println("for"); 
 } 
} 

