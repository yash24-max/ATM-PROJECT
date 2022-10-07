package KATM;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;







public class Process {


	
	//private static final ATM_BAL[] Bal = null;
	public static List<Account> account=new ArrayList<>();
	private static ATM_BAL[] Bala;
	private static Scanner sc;
	private static Scanner sc2;
	
	public static void Acc_details() {
	Account acc1= new Account(100,0110120,"RAM",2422,20000);
	Account acc2= new Account(101,0110121,"KUMAR",2439,24000);
	Account acc3= new Account(102,0110122,"RAJ",2000,50000);
	Account acc4= new Account(103,0110123,"THEODER",9999,55000);
	Account acc5= new Account(104,0110124,"ICOURT",2468,68000);
	Account acc6= new Account(105,0110125,"HARI",1630,45600);
	account.addAll(Arrays.asList(acc1,acc2,acc3,acc4,acc5,acc6));
	}
	
	public static  void deposit() {
		sc2 = new Scanner(System.in);
		System.out.println("enter userId");
		int Id = sc2.nextInt();
		System.out.println("enter Pin");
		int pass = sc2.nextInt();
		int amout = 0;
		boolean yes = true;
		for (Account u : account) {
			if (u.getuserId() == Id && u.getpin() == pass) {
				System.out.println("Enter the no of 2000");
				int No_of_2000 = sc2.nextInt();
				System.out.println("Enter the no of 500");
				int No_of_500 = sc2.nextInt();
				System.out.println("Enter the no of 200");
				int No_of_200 = sc2.nextInt();
				System.out.println("Enter the no of 100");
				int No_of_100 = sc2.nextInt();
				amout += 100 * No_of_100 + 200 *No_of_200 + 500 * No_of_500 + 2000 * No_of_2000;
				double bal = u.getAccBalance() + amout;
				u.setAccBalance(bal);
				for (ATM_BAL b :Bala) {
					int $2k = b.getNo_Of_2000() + No_of_2000;
					b.setNo_Of_2000($2k);
					int $5H = b.getNo_Of_500() + No_of_500;
					b.setNo_Of_500($5H);
					int $2H = b.getNo_Of_200() + No_of_200;
					b.setNo_Of_200($2H);
					int $1H = b.getNo_Of_100() + No_of_100;
					b.setNo_Of_100($1H);
					int tot = b.getTotal() + amout;
					b.setTotal(tot);
				}
				yes = false;
				System.out.println("Amount Deposited Successfully");
			}

		}
		if (yes) {
			System.out.println("No such user found");
		}
	}

	
	
	
	
	public static  void withDraw() {
		sc = new Scanner(System.in);
		int No_Of_2000=0;
		 int No_Of_500=0;
		 int No_Of_200=0;
		 int No_Of_100=0;
		 int Total=0;
		boolean g = false;
		for (ATM_BAL a : Bala) {
			No_Of_2000+= a.getNo_Of_2000();
			No_Of_500 += a.getNo_Of_500();
			No_Of_200 += a.getNo_Of_200();
			No_Of_100 += a.getNo_Of_100();
			Total += a.getTotal();

		}
		int x = 0;
		int c2000 = 0;
		int c200 = 0;
		int c500 = 0;
		int c100 = 0;
		System.out.println("enter userId");
		int id = sc.nextInt();
		System.out.println("enter Pin");
		int pass = sc.nextInt();
		boolean yes = true;
		for (Account u :account) {
			boolean y = true;
			if (u.getuserId() == id && u.getpin() == pass) {
				yes = false;
				System.out.println("Enter the amount to be withdraw");
				int n = sc.nextInt();
				x += n;
				if (n > u.getAccBalance()) {
					System.out.println("Insuficient Balance");
					break;
				} else if (n > Total) {
					System.out.println(" ATM  is Insuficient Balance");
					break;
				} else {
					while (n != 0) {
						if (n >= 2000) {
							int rem = n % 2000;
							int count = 0;
							while (n >= 2000) {
								count += 1;
								n = n / 2000;
							}
							c2000 += count;
							n = rem;

						} else if (n >= 500) {
							int rem = n % 500;
							int count = 0;
							while (n >= 500) {
								count += 1;
								n = n / 500;
							}
							c500 += count;
							n = rem;
						} else if (n >= 200) {
							int rem = n % 200;
							int count = 0;
							while (n >= 200) {
								count += 1;
								n = n / 200;
							}
							c200 += count;
							n = rem;
						} else if (n >= 100) {
							int rem = n % 100;
							int count = 0;
							while (n >= 100) {
								count += 1;
								n = n / 100;
							}
							c500 += count;
							n = rem;
						} else if (n < 100) {
							System.out.println("Your requset cannot be Processed");
							y = false;
							break;
						}
					}
				}
				if (y) {
					if (No_Of_2000 >= c2000 && No_Of_200 >= c200 && No_Of_500 >= c500 && No_Of_100 >= c100) {
						No_Of_2000 -= c2000;
						g = true;
						No_Of_200 -= c200;
						No_Of_500 -= c500;
						No_Of_100 -= c100;
						double val = u.getAccBalance() - x;
						u.setAccBalance(val);
						System.out.println("Your Current balance is " + u.getAccBalance());
					}
				} else {
					break;
				}

			}
			if (yes) {
				System.out.println("No such user found");
			}

		}
		if (g) {
			for (ATM_BAL a : Bala) {
				a.setNo_Of_100(No_Of_100);;
				a.setNo_Of_200(No_Of_200);;
				a.setNo_Of_500(No_Of_500);;
				a.setNo_Of_2000(No_Of_2000);;
				int val = a.getNo_Of_100() - x;
				a.setTotal(val);

			}
		}

	}
	public static void balance() {
		System.out.println("enter userId");
		int id = sc.nextInt();
		System.out.println("enter Pin");
		int pass = sc.nextInt();
		boolean yes = true;
		for (Account u : account) {
			if (u.getuserId() == id&& u.getpin() == pass) {
				System.out.println(u.getAccBalance());
				yes = false;
			}

		}
		if (yes) {
			System.out.println("No such user found");
		}

	}
	public static void atmBalance() {
		for (ATM_BAL a : Bala) {

			System.out.println("No.of Rs2000      " + a.getNo_Of_2000());
			System.out.println("No.of Rs500       " + a.getNo_Of_500());
			System.out.println("No.of Rs200       " + a.getNo_Of_200());
			System.out.println("No.of Rs100       " + a.getNo_Of_100());
			System.out.println("The net balance is" + a.getTotal());
		}
	}

	
	
   


}