package tecProg;
import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
public class Arthur extends AdvancedRobot{
	public void run() {
		setColors(Color.black, Color.green, Color.pink);

		while (true) {
			ahead(100);
			turnLeft(20);
			turnGunRight(360);

		}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
		fire(3);
		System.out.println(this.getName() + " - "+e.getDistance());
		
	}
	public void onHitWall(HitWallEvent event) {
	
        turnLeft(90);
        //criar while para enquanto não entiver com o robo inimigo na mira.
	}

}
