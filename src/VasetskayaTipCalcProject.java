import java.util.Scanner;
import java.text.DecimalFormat;

public class VasetskayaTipCalcProject{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //Greeting for the user:
        System.out.println("Greetings! With this program, you can calculate your tip amount.");

        //Takes user input for the number of people at their table as well as what tip percentage they want:
        System.out.println("Please enter the number of people at your table:");
        int numOfPpl = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter your tip percentage, as an integer from 0 to 100:");
        int tipPercent = Integer.parseInt(scan.nextLine());

        double totalBillB4Tip = 0;
        double itemCost = 0;
        //This is thw while loop that lets the user add as many costs of items as they want.
        while (itemCost != -1) {
            System.out.println("Please enter the cost of an item in dollars and cents (ex. 3.99), or type -1 to end:");
            itemCost = Double.parseDouble(scan.nextLine());
            totalBillB4Tip += itemCost;
        }
        //This next line adds 1 to the total bill before the tip, since the -1 used to add the program was also added to the total bill inside the while loop.
        //So, if we didn't add 1 here after the while loop, it would make all the following calculations inaccurate.
        totalBillB4Tip++;

        //These are the variables in which I stored the results of all the final calculations needed to print the requirements of the receipt:
        double totalTip = totalBillB4Tip * (tipPercent / 100.0);
        double totalBill = totalBillB4Tip + totalTip;
        double perPersonCostB4Tip = totalBillB4Tip / numOfPpl;
        double tipPerPerson = totalTip / numOfPpl;
        double totalCostPerPerson = perPersonCostB4Tip + tipPerPerson;

        //These print statements are what actually prints the receipt after the user has entered all the required information:
        System.out.println("\n-------------------------\n");
        System.out.println("Total bill before tip: $" + formatter.format(totalBillB4Tip));
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Total Tip: $" + formatter.format(totalTip));
        System.out.println("Total Bill with Tip: $" + formatter.format(totalBill));
        System.out.println("Per Person Cost Before Tip: $" + formatter.format(perPersonCostB4Tip));
        System.out.println("Tip Per Person : $" + formatter.format(tipPerPerson));
        System.out.println("Total Cost Per Person: $" + formatter.format(totalCostPerPerson));

        scan.close();
    }
}
