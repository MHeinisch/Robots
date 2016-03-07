public class Robot
{
	
	String ID;
	boolean isOn;
	double powerLevel;
	
	public Robot() {};
	
	public Robot(String id, double PowerLevel)
	{
		ID = id;
		isOn = false;
		powerLevel = PowerLevel;
	}
	
	public void TurnOn()
	{
		isOn = true;
		System.out.println(ID + " has been powered on.");
	}
	public void TurnOff()
	{
		isOn = false;
		System.out.println(ID + " has been powered off.");
	}
	public void DisplayPowerLevel()
	{
		System.out.println(ID + "'s current power level is " + powerLevel + ".");
	}
	public void Recharge()
	{
		TurnOff();
		System.out.println(ID + " is currently charging.");
		powerLevel = 100;
		TurnOn();
		DisplayPowerLevel();
	}
	public void ReadEnemy(Robot robot)
	{
		System.out.println(ID + " reads the enemy.");
		System.out.println("Name: " + robot.ID + ".");
		System.out.println("Current power level: " + robot.powerLevel + ".");
	}
	public void Move(double spacesMoved)
	{
		powerLevel -= (spacesMoved / 10);
		System.out.println(ID + " moved " + spacesMoved + " spaces.");
	}
	
}
