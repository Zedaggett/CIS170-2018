package CarHomework;

public class MileageProblem {
	

	
		public static void main (String[] args)
		{
			int n = 9;
			Car car1 = new Car(100, 20, 10);//topspeed,mpg,tank
			if (car1.getGallonsTillNextPitStop(20) == n)
{
	System.out.println("Test Pass");
}
else
{
	System.out.println("Test Fail");
}
			int m = 29;
			Car car2 = new Car(120,40,30);
			if (car2.getGallonsTillNextPitStop(40) == m)
			{
				System.out.println("Test Pass");
			}
			else
			{
				System.out.println("Test Fail");
			}
		}
}

