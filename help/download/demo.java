package demo;
import robocode.*; // Thư viện robocode
import java.awt.Color; // Thư viện để thêm màu sắc
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html
/**
* TenBanRobo - Robot được huấn luyện bởi (tên bạn ở đây)
*/
public class TenBanRobo extends Robot
{
	/**
	* Thực thi: hành động/hành vi mặc định của TenBanRobo
	*/
	public void run() {
		// Sự khởi đầu của Robot nên đặt ở đây
		setColors(Color.red,Color.blue,Color.green); // Thiết lập màu sắc: thân robo, nòng súng, radar
		// Vòng lặp chính của Robot
		while(true) {
			// Thay thế 04 dòng kế tiếp với hành động/hành vi mà bạn muốn
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}
	/**
	* onScannedRobot: Robot của bạn làm gì khi phát hiện một robot khác
	*/
	public void onScannedRobot(ScannedRobotEvent e) {
		// Thay thế dòng kế tiếp với hành động/hành vi mà bạn muốn
		fire(1);
	}
	/**
	* onHitByBullet: Robot của bạn làm gì khi bị trúng đạn
	*/
	public void onHitByBullet(HitByBulletEvent e) {
		// Thay thế dòng kế tiếp với hành động/hành vi mà bạn muốn
		back(10);
	}
	/**
	* onHitWall: Robot của bạn làm gì khi bị đụng tường
	*/
	public void onHitWall(HitWallEvent e) {
		// Thay thế dòng kế tiếp với hành động/hành vi mà bạn muốn
		back(20);
	}
}