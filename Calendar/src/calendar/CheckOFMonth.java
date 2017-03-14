package calendar;

public class CheckOFMonth {
	static Month[] months = Month.values();
  
   public static void checkMounth(String string){
     boolean exist = false;
     Month month = null;
      for (int i = 0; i < months.length; i++) {
		 if(string.equals(months[i].name())){
			  month = months[i]; 
			 exist = true;
		 }
	 }
	 if(exist){
    	 System.out.println();
		 System.out.println("MOUNTH "+string+" EXIST");
    	 AllMonthOfSameSeasons.checkSeason(month);
	 }
     else{
    	 System.out.println("MOUNTH " +string+" DOES NOT EXIST");
    	 Main.inputMounth();
     }
   }
 }
