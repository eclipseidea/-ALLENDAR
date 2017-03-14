package calendar;

public class DaysOfMonth {
  public static void checkDaysOfMonth(Month month){
	  if(month.getDays()%2==0) {
		  System.out.println();
		  System.out.println();
		  System.out.println("MONTH HAS EVEN NUMBERS OF DAYS"); 
	  }
	  else{
		  System.out.println();
		  System.out.println();
		  System.out.println("MONTH HAS NOT EVEN NUMBERS OF DAYS");
	  }
  }
}
