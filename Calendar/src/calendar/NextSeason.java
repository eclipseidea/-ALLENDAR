package calendar;

public class NextSeason {
	static Month[] months = Month.values();
	static Season[] seasons = Season.values();

	public static void nextSeason(Month month) {
		System.out.println();
		System.out.println();
		System.out.println("NEXT SEASON");
		String season = null;
		for (int i = 0; i < months.length; i++) {
			if (month.getSeason().ordinal() < months[i].getSeason().ordinal()) {
				season = months[i].getSeason().name();
				break;
			}
			if (month.getSeason().ordinal() == (months[i].getSeason().ordinal())) {
				season = "WINTER";
			}
		}
		System.out.println(season);
		PreviousSeason.previousSeason(month);
	}
}
