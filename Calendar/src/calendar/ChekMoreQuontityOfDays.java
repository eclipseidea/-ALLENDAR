package calendar;

public class ChekMoreQuontityOfDays {
	static Month[] mounth = Month.values();

	public static void checkMore(Month month) {
		System.out.println();
		System.out.println();
		System.out.println("MONTHS WICH HAS MORE QUONTITY OF DAYS");
		String monthDayss = null;
		boolean exist = false;
		for (int i = 0; i < mounth.length; i++) {
			if (month.getDays() < mounth[i].getDays()) {
				monthDayss = mounth[i].name();
				exist=true;
				System.out.print(monthDayss + " ");
			}
		}
	   if(!exist){
		   System.out.println("MONTH HAS THE HIGHEST NUMBER OF DAYS");
	   }
	   ChekMinQuontityOfDays.checkMin( month);
	}
}
