package ClockPackage;

public class AppClock {

	public static void main(String[] args) {

		// new default clock
		Clock defualtClock = new Clock();
		defualtClock.printTime(false);
		
        //new clock 2
		Clock motiClock = new Clock(5, 59, 59, 000);

		motiClock.printTime(true);

		motiClock.addHours(0);
		motiClock.printTime(false);
		
		motiClock.addMinutes(2);
		motiClock.printTime(true);
		
		motiClock.addSecound(130);
		motiClock.printTime(false);
	
		motiClock.addmilisecound(1001);
		
		motiClock.printTime(true);


	}
}