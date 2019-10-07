
public class InitialigingObject {
	
	String name;
	String breed;
	int age;
	String color;
	
	public InitialigingObject(String name,String breed,int age,String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBreed()
	{
		return breed;
	}
	public int getAge()
	{
		return age;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String toString() {
		
     return ("Hi my name is"+this.getName()+".\nMy Breed ,Age and Color are:"+this.getBreed()+","
     		+ ""+this.getAge()+","+this.getColor());		
	}
	public static void main(String[]args)
	{
		InitialigingObject animal = new InitialigingObject("Tommy","papilion",5,"white");
		System.out.println(animal.toString());
		
				
	}
	

}
