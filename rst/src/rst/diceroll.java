package rst;

	import java.util.Scanner;
	import java.util.Scanner;
		import java.util.Random; 
	import java.util.Scanner; // I use scanner because it's command line.
	
	//Created by Jordan Cabana
    //Date: made Friday, June 16
			public class diceroll {

		
		
			

public static void main(String[] args) {
	 System.out.println("Username = Dice:Pass = 123");
	String password1;
	 String username1;
	 String Username;
	    String Password;

	    Password = "123";
	    Username = "Dice";

	    Scanner input1 = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    username1 = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    password1 = input2.next();

	    if (username1.equals(Username) && password1.equals(Password)) {

	        System.out.println("Access Granted!");
	        
	    }

	    else if (password1 != (Password)) {
	        System.out.println("Invalid Password!");
	    } else if (username1 != (Username)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!");
	    }
	
	    
	System.out.println("Welcome to my Dice simulator");
	System.out.println("This was Created by Jordan Cabana");
	Scanner input = new Scanner(System.in);
	
	Random Rand = new Random();
	
	int[] frequency = new int[6];
	int times;
	int temp;
	
	System.out.println("How many times would you like to roll the dice?");
	times = input.nextInt();
	
	for(int i=0;i<times;i++){
	
		temp = Rand.nextInt (6);
		
		frequency[temp]++;
	}
	System.out.println("Face\tfrequency");
	for(int i=0;i<6;i++){
	
	System.out.println (i + "\t" + frequency[i]);
	
	}

}

private static int frequency(int i) {

	return  0;
}}