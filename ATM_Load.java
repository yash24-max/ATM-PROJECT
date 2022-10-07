package KATM;


import java.util.*;

public class ATM_Load {
    static int No_of_2000=20;
	static int No_of_500=100;
	static int No_of_100=100;
	static int No_of_200=100;
	public static int total=0;
	public static List<ATM_BAL> Bala=new ArrayList<>();
	 Scanner sc=new Scanner(System.in);
     static int current_Amt=0;
	
	 
	 public static void loadMoney()
	 {
		 if(Bala.size()==0)
		 {
			 total=2000*No_of_2000+500*No_of_500+200*No_of_200+100*No_of_100;
			 ATM_BAL A=new ATM_BAL(No_of_2000,No_of_500,No_of_200,No_of_100,total);
			 Bala.add(A);
			 current_Amt+=total;
			 System.out.println("Money Added!!");
			 System.out.println("Current Amount in ATM "+current_Amt);
			 
		 }
		 else {
			 int amt=0;
			 amt+=2000*No_of_2000+500*No_of_500+200*No_of_200+100*No_of_100;
			 for(ATM_BAL a:Bala)
			 {
				 int $2K=a.getNo_Of_2000()+No_of_2000;
				 a.setNo_Of_2000($2K);
				 int $5H=a.getNo_Of_500()+No_of_500;
				 a.setNo_Of_2000($5H);
				 int $2H=a.getNo_Of_200()+No_of_200;
				 a.setNo_Of_2000($2H);
				 int $1H=a.getNo_Of_100()+No_of_100;
				 a.setNo_Of_2000($1H);
				 int tot=a.getTotal()+amt;
				 a.setTotal(tot);
				 current_Amt+=a.getTotal();
				 }
			 System.out.println("Money Added!!");
			 System.out.println("Current Amount in ATM "+current_Amt);
		 }
	 }
	 
}