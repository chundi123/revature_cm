package com.snapchat.view;
import java.util.Scanner;

import com.snapchat.controller.SnapchatContoller;
import com.snapchat.controller.SnapchatContollerInterface;
public class SnapchatView {

	public static void main(String[] args) {
		System.out.println("**********Main Menu***********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("Press 4 to search profile ");
		System.out.println("Press 5 to viewAll profile ");
		System.out.println("Press 6 to profile ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice ");
		int cm=s.nextInt();
		SnapchatContollerInterface sc = new SnapchatContoller();
		switch(cm)
		{
		case 1:
			
			sc.createProfileController();
			break;
		case 2:
			sc.viewProfileController();
			break;
		case 3:
			sc.deleteProfileController();
			break;
		case 4:
			sc.editProfileController();
			break;
		case 5:
			sc.searchProfileController();
			break;
		case 6:
			sc.viewAllProfileController();
			break;
		case 7:
			sc.loginProfileController();
			break;
		
		default :System.out.println("Enter the valid input");
		// TODO Auto-generated method stub

	}

}
