package calendar;

public class NextSeason {
	static Month[] mounth = Month.values();
    public static void nextSeason(Month month){
    	System.out.println();
    	System.out.println();
    	System.out.println("NEXT SEASON");
    	for (int i = 0; i < mounth.length; i++) {
			if((month.getSeason().ordinal()<(mounth[i].getSeason().ordinal()))){
				String	season = mounth[i].getSeason().name(); 
				System.out.println(season);
				break;
			}
    	}
    }
}
