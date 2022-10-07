package KATM;

	import java.util.Scanner;

	public class ATM_Main {

		private static Scanner sc;

		public static void main(String[] args) {
			sc = new Scanner(System.in);
			while (true) {
				
				System.out.println("1.Add Money to the Atm");
				System.out.println("2.Deposit");
				System.out.println("3.withDraw");
				System.out.println("4.View Balance ");
				System.out.println("5.View ATM balance");
				System.out.println("6.Exit");
				
				int n = sc.nextInt();
				switch (n) {
				case 1:
					System.out.println("enter Admin Id");
					String s = sc.next();
					System.out.println("enter password");
					String s1 = sc.next();
					if (s.equals("Admin") && s1.equals("Admin")) {
						ATM_Load.loadMoney();
					} else {
						System.out.println("You are not eligible");
					}
					break;
			
					
				case 2:
					Process.deposit();
					break;
					
				case 3:
					Process.withDraw();
					break;
					
				case 4:
					Process.balance();
					break;
				case 5:
					System.out.println("enter Admin Id");
					String s2 = sc.next();
					System.out.println("enter password");
					String s3 = sc.next();
					if (s2.equals("Admin") && s3.equals("Admin")) {
						Process.atmBalance();
					} else {
						System.out.println("You are not eligible");
					}
					break;
				case 6:
					System.out.println("Thank you ");
					break;
				}
			}

		}
	}

