package Ex802;

public class ClockTest
{
	public static void main(String[] args)
	{
		Clock time1 = new Clock(3666);
		Clock time2 = new Clock(3600);

		System.out.println(time1);

		// testing getters
		System.out.printf("Testing getters: %d %d %d\n", time1.getHours(), time1.minutes, time1.getSeconds());

		System.out.printf("Your time converted to seconds is: %d seconds.\n", time1.convertToSeconds());

		System.out.printf("Current time is before passed in time: %b\n", time1.isBefore(time2));

		System.out.printf("The passed in seconds equal to: %s\n", time1.secondsToClock(3666));

		time1.setTimeFormat(12);
		System.out.println(time1);

		time1.setTimeFormat(24);
		System.out.println(time1);
	}
}
