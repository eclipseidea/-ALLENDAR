package calendar;

public class CheckMinQuontityOfDays {
	static Month[] mounth = Month.values();
    
	public static void checkMin(Month month) {
		System.out.println();
		System.out.println();
        System.out.println("MONTHS WICH HAS lOWEST QUONTITY OF DAYS");
		String monthDayss = null;
		boolean exist = false;
		for (int i = 0; i < mounth.length; i++) {
			if (month.getDays() > mounth[i].getDays()) {
				monthDayss = mounth[i].name();
				exist=true;
				System.out.print(monthDayss + " ");
			}
		}
	   if(!exist){
		   System.out.println("MONTH HAS THE lOWEST NUMBER OF DAYS");
	   }
	   NextSeason.nextSeason(month);
	}
}