package calendar;

public class CheckOFmounth {
	static Month[] mounth = Month.values();

	public Month[] getMounth() {
		return mounth;
	}

	public void setMounth(Month[] mounth) {
		CheckOFmounth.mounth = mounth;
	}
  
   public static void checkMounth(String string){
     boolean exist = false;
     Month month = null;
      for (int i = 0; i < mounth.length; i++) {
		 if(string.equals(mounth[i].name())){
			  month = mounth[i]; 
			 exist = true;
		 }
	 }
	 if(exist){
    	 System.out.println();
		 System.out.println("MOUNTH "+string+" EXIST");
    	 AllMounthOfSameSeasons.checkSeason(month);
	 }
     else{
    	 System.out.println("MOUNTH " +string+" DOES NOT EXIST");
    	 Main.inputMounth();
     }
   }
 }
