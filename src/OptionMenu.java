import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends AccountATM{

    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        int y = 1;
        do {
                try {
                    data.put(1234, 4321);
                    data.put(5678, 8765);
                    System.out.println("Welcome to the ATM");
                    System.out.println("Please Enter your customer number :");
                    setCustomerNumber(menuInput.nextInt());
                    System.out.println("Please Enter your Pin Number :");
                    setPinNumber(menuInput.nextInt());
                } catch (Exception e) {
                    System.out.println("\n" + "Invalid characters.only numbers");// what should i do to back to the get login again when the user insert something except int
                    x = 2;
                }

            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else {
                System.out.println("\n" + "Wrong customer number or pn number");
            }
        }while (x==1);


    }
    public void getAccountType(){

        System.out.println("Please choose a type account:");
        System.out.println("1.Checking Balance");
        System.out.println("2.Saving Balance");
        System.out.println("1.Exit");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                checkingBalanceMenu();
                break;
            case 2:
                savingBalanceMenu();
                break;
            case 3:
                System.out.println("\n" + "Thank you for using our ATM,bye");

            default:
                System.out.println("\n" + "Please choose a number between 1 to 3");
        }
    }
    public void checkingBalanceMenu(){
        System.out.println("Checking Account :");
        System.out.println("1-View Balance");
        System.out.println("2-Withdraw Funds");
        System.out.println("3-Deposit Funds");
        System.out.println("4-Exit");
        System.out.println("Choice:");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                System.out.println("Checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("\n" + "Wrong choice");
                getAccountType();

        }
    }
    public void savingBalanceMenu(){
        System.out.println("Saving Account :");
        System.out.println("1-View Balance");
        System.out.println("2-Withdraw Funds");
        System.out.println("3-Deposit Funds");
        System.out.println("4-Exit");
        System.out.println("Choice:");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                System.out.println("Saving Account Balance:" + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("/n" + "Wrong choice");
                getAccountType();

        }
    }

}
