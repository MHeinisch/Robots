public class IronMan extends Robot
{
	
	int weaponDamage;
	
	public IronMan(String id, int PowerLevel, int WeaponDamage)
	{
		super(id, PowerLevel);
		weaponDamage = WeaponDamage;
		isOn = false;
	}
	
	public double EnergyBlast(Robot robot)
	{	
		weaponDamage = 10;
		System.out.println(ID + " attacks " + robot.ID + ", dealing" + weaponDamage + " damage.");
		robot.powerLevel -= weaponDamage;
		powerLevel -= 2;
		return robot.powerLevel;
	}
	public double AvengersAssemble(Robot robot)
	{
		weaponDamage = 50;
		System.out.println("The Avengers arrive and attack as a team, dealing " + weaponDamage + " damage to " + robot.ID + ".");
		robot.powerLevel -= weaponDamage;
		powerLevel -= 30;
		return robot.powerLevel;
	}
}
