package Ex802;

import java.text.DecimalFormat;

public class Clock
{
	Clock()
	{}

	/** converting total time in seconds to normal time */
	Clock(int totalTimeInSeconds)
	{
		this.hours = totalTimeInSeconds / 3600;

		int minutesRemaining = totalTimeInSeconds % 3600;
		this.minutes = minutesRemaining / 60;

		int secondsRemaining = minutesRemaining % 60;
		this.seconds = secondsRemaining;
	}

	Clock(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	int seconds;
	int minutes;
	int hours;
	boolean timeFormat24;
	DecimalFormat formatter = new DecimalFormat("00");

	/** Returns a Clock type from given total time in seconds */
	public Clock secondsToClock(int totalTimeInSeconds)
	{
		int hours = totalTimeInSeconds / 3600;

		int minutesRemaining = totalTimeInSeconds % 3600;
		int minutes = minutesRemaining / 60;

		int secondsRemaining = minutesRemaining % 60;
		int seconds = secondsRemaining;

		Clock tempClock = new Clock(hours, minutes, seconds);

		return tempClock;
	}

	/** Checks if current time is before passed in time */
	public boolean isBefore(Clock time)
	{
		if (this.convertToSeconds() < time.convertToSeconds())
			return true;
		else
			return false;
	}

	public void setSeconds(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int convertToSeconds()
	{
		return ((this.hours * 3600) + (this.minutes * 60) + this.seconds);
	}

	public void tic()
	{
		this.seconds += 1;
	}

	public int getSeconds()
	{
		return seconds;
	}

	public int getMinutes()
	{
		return minutes;
	}

	public int getHours()
	{
		return hours;
	}

	public boolean isTimeFormat24()
	{
		return this.timeFormat24;
	}

	public void setTimeFormat(int hourFormat)
	{
		if (hourFormat == 24)
			timeFormat24 = true;
		else if (hourFormat == 12)
			timeFormat24 = false;
		else
			return;
	}

	@Override
	public String toString()
	{
		if (timeFormat24 == true && this.hours >= 0 && this.hours <= 24)
			return "24h format time is: " + formatter.format(this.hours) + ":" + formatter.format(this.minutes) + ":"
					+ formatter.format(this.seconds);
		else if (timeFormat24 == false && this.hours >= 0 && this.hours <= 12)
			return "12h format time is: " + formatter.format(this.hours) + ":" + formatter.format(this.minutes) + ":"
					+ formatter.format(this.seconds) + " AM";
		else if (timeFormat24 == false && this.hours >= 12 && this.hours <= 24)
			return "12h format time is: " + formatter.format(this.hours) + ":" + formatter.format(this.minutes) + ":"
					+ formatter.format(this.seconds) + " PM";
		else
			return "ATTENTION: You have inserted a time larger than 1 full day.\n" + "Hours: " + this.hours
					+ " Minutes: " + this.minutes + " Seconds: " + this.seconds;
	}

}
