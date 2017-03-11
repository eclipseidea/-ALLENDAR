package calendar;

import java.util.Scanner;

public class Main {
	
	public static void startChek(){
		Main.inputMounth();
	}
	
	public static void inputMounth(){
    	Scanner scanner = new Scanner(System.in);
		System.out.println("INPUT YOUR MONTH");
    	System.out.println();
		String string = scanner.nextLine();
		CheckOFmounth.checkMounth(string.toUpperCase());
	    scanner.close();
	}
    
	public static void main(String[] args) {
		Main.startChek();
		
	}

	
}
