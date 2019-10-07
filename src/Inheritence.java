
public class Inheritence {
	public static void main(String[] args)
	{
		Bike b = new Bike(3,100,125);
		System.out.println(b.toString());
	}
	
}

class Bike extends AutoMobile
{
   int seatHeight;
	public Bike(int gear, int speed,int startHeight) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		seatHeight = startHeight;
		
	}
	
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
		
	}
	@Override
	public String toString() {
		return (super.toString()+"\nseat height is: "+seatHeight);
	
	}
	
}

 class AutoMobile
{
	 public int gear;
		public int speed;
		
		public AutoMobile(int gear,int speed)
		{
			// the Bicycle class has two fields 
			this.gear = gear;
			this.speed = speed;
					
		}
		
		public void applyBrake(int decrement)
		{
			speed -= decrement;
			
		}
		public void speedUp(int increment)
		{
			speed += increment;
		}
		
		public String toString()
		{
			return("no of gears are: "+gear+".\nspeed of Bycycle: "+speed);
		}

	
}
























