public class VasetskayaTipCalcProject{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings! With this program, you can calculate your tip amount.");

        System.out.println("Please enter the number of people at your table:");
        int numOfPpl = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter your tip percentage, as an integer from 0 to 100:");
        int tipPercent = Integer.parseInt(scan.nextLine());

        double totalBillB4Tip = 0;
        double itemCost = 0;
        while (itemCost != -1) {
            System.out.println("Please enter the cost of the first item in dollars and cents (ex. 3.99), or type -1 to end:");
            itemCost = Integer.parseInt(scan.nextLine());
            totalBillB4Tip += itemCost;
        }

        double totalTip = totalBillB4Tip * (tipPercent / 100.0);
        double totalBill = totalBillB4Tip + totalTip;
        double perPersonCostB4Tip = totalBillB4Tip / numOfPpl;
        double tipPerPerson = totalTip / numOfPpl;
        double totalCostPerPerson = perPersonCostB4Tip + tipPerPerson;

        System.out.println("\n-------------------------\n");
        System.out.println("Total bill before tip: $" + totalBillB4Tip);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Total Tip: $" + totalTip);
        System.out.println("");
    }
}
