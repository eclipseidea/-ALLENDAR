package calendar;

public class EvenNumberDaysOfMonths {
	static Month[] mounth = Month.values();
	
	public static void evenNumberDays(){
	  System.out.println();
	  System.out.println("MONTHS WICH HAS EVEN NUMBERS OF DAYS");
	for (int i = 0; i < mounth.length; i++) {
		if((mounth[i].getDays())%2==0){
	     String days = mounth[i].name();
	      System.out.print(days+" ");
		}
	   } 
    }
}
