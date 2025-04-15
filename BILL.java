import java.util.Scanner;

public class BILL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("             ELECTRICITY BILL");
        System.out.println("==============================================");
        System.out.print("Enter Consumer Name      : ");
        String name = scanner.nextLine();
        System.out.print("Enter Consumer Number    : ");
        String Number = scanner.nextLine();
        System.out.print("Enter Units Consumed     : ");
        int units = scanner.nextInt();
        double billAmount = 0;
        int firstSlab = 0, secondSlab = 0, thirdSlab = 0, lastSlab = 0;
        if (units <= 100) {
            firstSlab = units;
        } else if (units <= 200) {
            secondSlab = units ;
        } else if (units <= 300) {
            thirdSlab = units;
        } else {
            firstSlab = 100;
            secondSlab = 100;
            thirdSlab = 100;
            lastSlab = units - 300;
        }
        billAmount = (firstSlab * 2.0) +
                     (secondSlab * 3.0) +
                     (thirdSlab * 4.0) +
                     (lastSlab * 5.0);
                     double sgst = billAmount * 0.09;
                     double cgst = billAmount * 0.09;
                     double final2 = billAmount + sgst + cgst;   
        System.out.println("==============================================");
        System.out.println("Consumer Name        : " + name);
        System.out.println("Consumer Number      : " + Number);
        System.out.println("Units Consumed       : " + units);
        System.out.println("===============================================");
        System.out.printf ("%-25s : ₹%.2f\n", "First 100 units @ ₹2", firstSlab * 2.0);
        System.out.printf ("%-25s : ₹%.2f\n", "Next 100 units @ ₹3", secondSlab * 3.0);
        System.out.printf ("%-25s : ₹%.2f\n", "Next 100 units @ ₹4", thirdSlab * 4.0);
        System.out.printf ("%-25s : ₹%.2f\n", "Above 300 units @ ₹5", lastSlab * 5.0);
        System.out.println("===============================================");
        System.out.printf ("%-25s : ₹%.2f\n", "SGST @ 9%", sgst);
        System.out.printf ("%-25s : ₹%.2f\n", "CGST @ 9%", cgst);
        System.out.println("----------------------------------------------");
        System.out.printf ("%-25s : ₹%.2f\n", "Total Amount Payable", + final2);
        System.out.println("==============================================");
    }
}