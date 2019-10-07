
public class JavaConstructor {

	int modelYear;
	String modelName;
	
	public JavaConstructor(int year,String name)
	{
		modelYear=year;
		modelName=name;
	}
	public static void main(String[] args)
	{
		JavaConstructor car = new JavaConstructor(2000,"TOYOTA");
		
		System.out.println(car.modelYear+" "+car.modelName);
	}
	
}
