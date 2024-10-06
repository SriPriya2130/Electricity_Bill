package project22;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter your location: ");
		String a=Sc.nextLine();
		System.out.println("Enter the unit: ");
		int n = Sc.nextInt();
		switch(a) {
		case "Coimbatore":
			int u=4;
			System.out.println("Your current bill is: " + n*u);
			System.out.println("Your used unit is: " + n);
			break;
		case "Chennai":
			int b=2;
			System.out.println("Your current bill is: " + n*b);
			System.out.println("Your used unit is: " + n);
			break;
		case "Erode":
			int c=6;
			System.out.println("Your current bill is: " + n*c);
			System.out.println("Your used unit is: " + n);
			break;
		case "Salem":
			int d=7;
			System.out.println("Your current bill is: " + n*d);
			System.out.println("Your used unit is: " + n);
			break;
		case "Tiruppur":
			int f=10;
			System.out.println("Your current bill is: " + n*f);
			System.out.println("Your used unit is: " + n);
			break;
		case "Madurai":
			int g=8;
			System.out.println("Your current bill is: " + n*g);
			System.out.println("Your used unit is: " + n);
			break;
		case "Dharmapuri":
			int i=8;
			System.out.println("Your current bill is: " + n*i);
			System.out.println("Your used unit is: " + n);
			break;
		case "Thirunelveli":
			int v=6;
			System.out.println("Your current bill is: " + n*v);
			System.out.println("Your used unit is: " + n);
			System.out.println("Your due date has been extended till January");
			break;
		case "Tuticorin":
			int m=7;
			System.out.println("Your current bill is: " + n*m);
			System.out.println("Your used unit is: " + n);
			System.out.println("Your due date has been extended till January");
			break;
		case "Palani":
			int k=12;
			System.out.println("Your current bill is: " + n*k);
			System.out.println("Your used unit is: " + n);
			break;
		default: 
			System.out.println("Your used unit is: " + n);
			System.out.println("<=100 has no electricity bill has to be paid");
	}
		Sc.close();
}
}
