package ClockPackage;

public class AppClock {

	public static void main(String[] args) {

		// new default clock
		//Clock defualtClock = new Clock();
		//defualtClock.printTime(false);
		
        //new clock 2
		Clock motiClock = new Clock(00, 00, 0, 000);
		motiClock.addmilisecound(9);
		motiClock.printTime(false);
		motiClock.addSecound(30);
		motiClock.printTime(false);
		motiClock.addSecound(3);
		motiClock.printTime(false);
		motiClock.addSecound(60);
		motiClock.printTime(false);
	}
}