package com.whatsapp;
import java.util.Scanner;

public class WhatsappView {

	public static void main(String[] args) {
		
		System.out.println("**************Main***********");
		System.out.println("Press 1 to create profile ");
		System.out.println("Press 2 to view profile ");
		System.out.println("Press 3 to delete profile ");
		System.out.println("Press 3 to edit profile ");
		System.out.println("Press 4 to search profile ");
		System.out.println("Press 5 to viewAll profile ");
		System.out.println("Press 6 to profile ");
		Scanner s = new Scanner(System.in);
		int cm=s.nextInt();
		System.out.println("Enter the choice ");
		WhatsappControllerInterface wa=new WhatsappController();
		switch(cm) {
		case 1: wa.createProfileController();
			break;
		case 2: wa.viewProfileController();
			break;
		case 3: wa.deleteProfileController();
			break;
		case 4: wa.editProfileController();
			break;
		case 5: wa.searchProfileController();
			break;
		case 6: wa.viewAllProfileController();
			break;
		case 7: wa.loginProfileController();
			break;
		
		default :System.out.println("Enter the valid input");
		}
		// TODO Auto-generated method stub

	}

}
