import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		
		Robot Codsworth = new Robot("Codsworth", 100);
		Drone Drone1 = new Drone("Drone 1", 100, 5);
		IronMan IronMan = new IronMan("Iron Man", 100, 10);
		
		Codsworth.TurnOn();
		Drone1.TurnOn();
		IronMan.TurnOn();
		System.out.println();
		
		Codsworth.DisplayPowerLevel();
		System.out.println();
		
		Codsworth.ReadEnemy(Drone1);
		System.out.println();
		
		Drone1.Move(500);
		System.out.println();
		
		Codsworth.ReadEnemy(Drone1);
		System.out.println();
		
		IronMan.AvengersAssemble(Drone1);
		System.out.println();
		
		Codsworth.ReadEnemy(Drone1);
		System.out.println();
		
		Drone1.Recharge();
		
	}
}
