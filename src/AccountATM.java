
import java.text.DecimalFormat;
import java.util.Scanner;


public class AccountATM {
    private int customerNumber = 0;
    private int pinNumber = 0;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input =  new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calCheckingWithdraw(double amount){

        checkingBalance = (checkingBalance - amount );
        return checkingBalance;
    }
    public double calSavingWithdraw(double amount){

        savingBalance = (savingBalance - amount );
        return savingBalance;
    }

    public double calCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount );
        return checkingBalance;

    }
    public double calSavingDeposit(double amount){

        savingBalance = (savingBalance + amount );
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance) );
        System.out.println("Please Enter your amount for withdraw from checking account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0){
            calCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance Can not be Negative " + "/n");
        }
    }
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
        System.out.println("Please Enter your amount for withdraw from checking account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calSavingWithdraw(amount);
            System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance Can not be Negative " + "/n");
        }
    }

        public void getCheckingDepositInput(){
           System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance) );
            System.out.println("Please Enter your amount for Deposit in checking balance account: ");

            double amount = input.nextDouble();
            if ((checkingBalance + amount) >= 0){
                calCheckingDeposit(amount);
                System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
            }
            else {
                System.out.println("Balance Can not be Negative " + "/n");
            }
        }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
        System.out.println("Please Enter your amount for Deposit in Saving balance account: ");

        double amount = input.nextDouble();
        if ((savingBalance + amount) >= 0) {
            calSavingDeposit(amount);
            System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance Can not be Negative " + "/n");
        }





    }













}
