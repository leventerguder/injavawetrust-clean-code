package chapter02.examples;

public class Test08 {

	void unfriendly() {
		int s = 0;
		int[] t = null;
		for (int j = 0; j < 34; j++) {
			s += (t[j] * 4) / 5;
		}
	}

	void friendly() {
		int realDaysPerIdealDay = 4;
		int WORK_DAYS_PER_WEEK = 5;
		int NUMBER_OF_TASKS = 34;
		int taskEstimate[] = null;
		int realdays = 7;
		int sum = 0;
		for (int j = 0; j < NUMBER_OF_TASKS; j++) {
			int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
			int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
			sum += realTaskWeeks;
		}
		/*
		 * Note that sum, above, is not a particularly useful name but at least is
		 * searchable. The intentionally named code makes for a longer function, but
		 * consider how much easier it will be to find WORK_DAYS_PER_WEEK than to find
		 * all the places where 5 was used and filter the list down to just the
		 * instances with the intended meaning.
		 */
	}
}
