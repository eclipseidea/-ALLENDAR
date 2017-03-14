package calendar;

public class PreviousSeason {
	static Month[] mounth = Month.values();
	static Season[] seasons = Season.values();

	public static void previousSeason(Month month) {
		System.out.println();
		System.out.println("PREVIOUS SEASON");
		String season = null;
		for (int i = seasons.length - 1; i >= 0; i--) {
			if (seasons[i].ordinal() < month.getSeason().ordinal()) {
				season = seasons[i].name();
				break;
			}
			if (seasons[i].ordinal() == month.getSeason().ordinal()) {
				season = "AUTUMN";
			}
		}
		System.out.println(season);
		EvenNumberDaysOfMonths.evenNumberDays();
		NotEvenNumberDaysOfMonths.notEvenNumberDays();
		DaysOfMonth.checkDaysOfMonth(month);
	}
}
