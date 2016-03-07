public class Drone extends Robot
{

	int weaponDamage;
	String droneExplaination = "Drones are small, flight-capable robots that use small lasers to deal 5 damage at a time.";
	
	public Drone(String id, double PowerLevel, int WeaponDamage)
	{
		super(id, PowerLevel);
		weaponDamage = WeaponDamage;
		isOn = false;
	}
	
	public double LaserAttack(Robot robot)
	{
		weaponDamage = 5;
		System.out.println(ID + " attacks " + robot.ID + ", dealing 5 damage.");
		robot.powerLevel -= weaponDamage;
		powerLevel -= 1;
		return robot.powerLevel;
	}	
	
}
