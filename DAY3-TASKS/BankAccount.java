package task.corejava;

public class BankAccount {
	 private String Accountholder;
	    private int Balance;
	    BankAccount(String Accountholder , int Balance){
	        this.Accountholder=Accountholder;
	        this.Balance=Balance;
	    }
	    public String getAccountholder(){
	        return Accountholder;
	    }
	    public int getBalance(){
	        return Balance;
	    }
	    public void Deposit(int dep){
	        if(Balance > 0){
	            Balance += dep;
	            System.out.println("Deposit Ammount:"+dep);
	             System.out.println("Current Balance:"+Balance);
	        }
	    }
	        public void setAccountholder(String Accountholder){
	            this.Accountholder=Accountholder;
	        }
	        public void setWithdraw(int withdraw){
	            Balance -= withdraw;
	            System.out.println("withdraw Amount:"+withdraw);
	        }
	}
	class BankDetails {
	    public static void main(String[] args) {
	        BankAccount ac=new BankAccount("Dhanu",20000);
	        System.out.println("Account holder Name:"+ac.getAccountholder());
	        ac.setAccountholder("manisha");
	        System.out.println("Balance:"+ac.getBalance());
	        ac.Deposit(3000);
	       ac.setWithdraw(20000);
	       System.out.println("Available Balance:"+ac.getBalance());
	    }
	}


