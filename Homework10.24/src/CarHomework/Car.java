package CarHomework;

public class Car {


	int topSpeed;
	int mpg;
	int tank;
	public Car(int topSpeed, int mpg, int tank) {
	
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public int getTank() {
		return tank;
	}
	public void setTank(int tank) {
		this.tank = tank;
	}
	public int getGallonsTillNextPitStop(int milesTraveled) {
		int maxMiles = mpg*tank;
		int milesLeft = maxMiles - milesTraveled;
			if (milesTraveled < maxMiles)
				return milesLeft/mpg;
			if (milesTraveled == 0)
				return tank;
		}
}