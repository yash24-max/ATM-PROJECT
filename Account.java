package KATM;



public class Account {
	int userId;
	 int Acc_No;
	 String Name;
	 int pin;
	double AccBalance=0;
	
 
    public Account(int userId, int Acc_No, String Name,int pin, double AccBalance) {
    	super();
		this.userId = userId;
		this.Acc_No = Acc_No;
		this.Name=Name;
		this.pin = pin;
		this.AccBalance = AccBalance;

	}
    public void setUserId(int userId)
    {
    	this.userId=userId;
    }
    public int getuserId(){
        return userId;
    }
	public void setAcc_No(int Acc_No){
        this.Acc_No=Acc_No;
    }
    public int getAcc_No(){
        return Acc_No;
    }    
    public void setName(String Name)
    {
    	this.Name=Name;
    }
    public String getName()
    {
    	return Name;
    }
    public void setpin(int pin)
	{
		this.pin=pin;
	}
	public int getpin()
	{
		return pin;
	}
    public void setAccBalance(double AccBalance)
	{
		this.AccBalance=AccBalance;
	}
	public double getAccBalance()
	{
		return AccBalance;
		
	}
  

   }