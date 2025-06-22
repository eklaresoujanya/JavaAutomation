package javaOOPSExceptionAssessment;

public class BankAccount{

    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    private float deposit(float amount){
        float updatedBal = getBalance()+amount;
        System.out.println("Balance after deposit: " + updatedBal);
        return  updatedBal;
    }

    private float withdrawal(float withdraw){
        float updatedBal = getBalance()-withdraw;
        System.out.println("Balance after withdraw: " + updatedBal);
        return updatedBal;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        float newBal =  bankAccount.deposit(500);
        bankAccount.withdrawal(200);
    }

}
