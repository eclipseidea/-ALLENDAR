package calendar;

public class NotEvenNumberDaysOfMonths {
	static Month[] mounth = Month.values();
	
	public static void notEvenNumberDays(){
	  System.out.println();
	  System.out.println();
	  System.out.println("MONTHS WICH HAS NOT EVEN NUMBERS OF DAYS");
	for (int i = 0; i < mounth.length; i++) {
		if((mounth[i].getDays())%2!=0){
	     String days = mounth[i].name();
	      System.out.print(days+" ");
		}
	   } 
    }
}
