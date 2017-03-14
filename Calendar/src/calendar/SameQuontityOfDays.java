package calendar;

public class SameQuontityOfDays {
	static Month[] months = Month.values();

	public static void checkEquals(Month month) {
		System.out.println();
		System.out.println();
		System.out.println("MONTHS WICH HAS SAME QUONTITY OF DAYS");
		String monthDays = null;
		for (int i = 0; i < months.length; i++) {
			if (month.getDays() == months[i].getDays()) {
				monthDays = months[i].name();
				System.out.print(monthDays + " ");
			}
		}
		ChekMoreQuontityOfDays.checkMore(month);
	}
}