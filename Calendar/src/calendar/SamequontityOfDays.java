package calendar;

public class SamequontityOfDays {
	static Month[] mounth = Month.values();

	public static void checkEquals(Month month) {
		System.out.println();
		System.out.println();
		System.out.println("MONTHS WICH HAS SAME QUONTITY OF DAYS");
		String monthDays = null;
		for (int i = 0; i < mounth.length; i++) {
			if (month.getDays() == mounth[i].getDays()) {
				monthDays = mounth[i].name();
				System.out.print(monthDays + " ");
				//			}
//			if (monthDays.equals(mounth[i].name())) {
//
//			} else {
//				System.out.print(monthDays + " ");
//				
			}
		}
		ChekMoreQuontityOfDays.checkMore(month);
	}
}