package calendar;

public class AllMonthOfSameSeasons {

	static Month[] months = Month.values();

	public Month[] getMounth() {
		return months;
	}

	public static void checkSeason(Month month) {
		System.out.println();
		System.out.println("MONTHS OF THE SEASON");
		String monthOfSeason = null;
		for (int i = 0; i < months.length; i++) {
			if (month.getSeason().equals(months[i].getSeason())){
				monthOfSeason = months[i].name();	
			    System.out.print(monthOfSeason+ " ");
			   
			}
	}
		SameQuontityOfDays.checkEquals(month);
  }
}
