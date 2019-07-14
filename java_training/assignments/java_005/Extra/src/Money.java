
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {
    Money(){
        CountMoney cm;
    }


    public static void setPenny() throws IOException {
        System.out.println("Enter amount of pennies");
        CountMoney.PENNY.setAmount(getAmount());
    }
    public static void setNickel() throws IOException {
        System.out.println("Enter amount of Nickels");
        CountMoney.NICHEL.setAmount(getAmount());
    }
    public static void setDime() throws IOException {
        System.out.println("Enter amount of Dimes");
        CountMoney.DIME.setAmount(getAmount());
    }
    public static void setQuarter() throws IOException {
        System.out.println("Enter amount of Quarters");
        CountMoney.QUARTER.setAmount(getAmount());
    }
    public static void setHalfDollar() throws IOException {
        System.out.println("Enter amount of Half Dollars");
        CountMoney.HALFDOLLAR.setAmount(getAmount());
    }
    public static void setDollar() throws IOException {
        System.out.println("Enter amount of Dollars");
        CountMoney.DOLLAR.setAmount(getAmount());
    }


    public static void returnRaw(){
        double amount =CountMoney.PENNY.Dollars();
        if(amount==0.00){
            System.out.println("0");
        }else{
            System.out.println(new DecimalFormat("0.00").format(amount));
        }
    }
    public static void returnPretty(){
        double amount = CountMoney.PENNY.Dollars();
        // get integer part
        long dollars = (long)amount;
        // get fractional part
        int pennies = (int)((amount - dollars)*100);

        if(amount==0.00){
            System.out.println("no money has been set");
        }else{
        System.out.println(dollars+ " dollars and "+pennies+" cents");
        }
    }
    public static void returnCurrenty(){
        double amount = CountMoney.PENNY.Dollars();
        // get integer part
        long dollars = (long)amount;
        // get fractional part
        int pennies = (int)((amount - dollars)*100);
        if(amount==0.00){
            System.out.println("no money has been set");
        }else{
        System.out.println("$."+dollars+"."+pennies);
        }
    }
    public static void setMoney() throws IOException {
        setPenny();
        setNickel();
        setDime();
        setQuarter();
        setHalfDollar();
        setDollar();
    }

    public static int getAmount() throws IOException {
        //holds amount
        int amount=0;

            try {
                //take input from user
                Scanner myInput = new Scanner( System.in );
                amount =  myInput.nextInt();
        } catch (NumberFormatException exc) {
            System.out.println("Invalid input");
        }
        return amount;
    }


}
