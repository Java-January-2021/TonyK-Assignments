
public class BankAccountTest{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        
        System.out.println("Account number: " + account1.getAccountNumber());
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.depositChecking(33.33);
        account1.depositSavings(750);
        account1.withdrawalChecking(40);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawalSavings(60);
        System.out.println(account1.getSavingsBalance());
        account1.total();
        System.out.println("Your total is : $" + account1.total());
        
   }
}