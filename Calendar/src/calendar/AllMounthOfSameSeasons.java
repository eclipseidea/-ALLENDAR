package calendar;

public class AllMounthOfSameSeasons {

	static Month[] mounth = Month.values();

	public Month[] getMounth() {
		return mounth;
	}

	public static void checkSeason(Month month) {
		System.out.println();
		System.out.println("MONTHS OF THE SEASON");
		String monthOfSeason = null;
		for (int i = 0; i < mounth.length; i++) {
			if (month.getSeason().equals(mounth[i].getSeason())){
				monthOfSeason = mounth[i].name();	
			    System.out.print(monthOfSeason+ " ");
			   
			}
	}
		SamequontityOfDays.checkEquals(month);
  }
}
