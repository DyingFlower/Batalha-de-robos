package tecProg;
	import java.awt.Color;
	import robocode.AdvancedRobot;
	import robocode.HitWallEvent;
	import robocode.ScannedRobotEvent;
	public class Arthur extends AdvancedRobot{
		public void run() {
			setColors(Color.black, Color.green, Color.white);

			while (true) {
				ahead(1000);
				turnGunRight(360);

			}
		}
		public void onScannedRobot(ScannedRobotEvent e) {
			while(true) {
				fire(3);
			}
			
		}
		public void onHitWall(HitWallEvent event) {
		
	        turnLeft(90);
	        turnGunLeft(360);
		}

	}
	
