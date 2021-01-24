import java.util.Random;

public class BankAccount{
    private String accountNumber; 
    private double checkingBalance; 
    private double savingsBalance; 
    private static double totalAmount;


public BankAccount(){
    generateNewAccountNumber();
}

public String getAccountNumber(){
    return accountNumber;
}

private String generateNewAccountNumber(){
    String numbers = "0123456789";
    String newAccountNumber = "";

    Random rand = new Random();

    for (int i = 0; i < 5; i++){
        int num = numbers.charAt(rand.nextInt(10));
        newAccountNumber += num; 
    }
    
    accountNumber = newAccountNumber; 

    return newAccountNumber;
}

public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
}

public double getCheckingBalance(){
    System.out.println("Checking account : $" + this.checkingBalance);
    return this.checkingBalance;
}

public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
}

public double getSavingsBalance(){
    System.out.println("Savings account : $" + this.savingsBalance);
    return this.savingsBalance;

}

public void depositChecking(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    totalAmount += checkingBalance;
}

public void depositSavings(double savingsBalance){
    this.setSavingsBalance(savingsBalance);
    totalAmount += savingsBalance;
}

public double total(){
    totalAmount = savingsBalance + checkingBalance;
    return totalAmount;
}

public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("Not enough money.");
    } 
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));

    }
}

public void withdrawalSavings(int amount){
    if (getSavingsBalance() < Double.valueOf(amount)){
        System.out.println("Not enough money.");
    } 
    else{
        this.setSavingsBalance(this.getSavingsBalance() - Double.valueOf(amount));
    }

}
}