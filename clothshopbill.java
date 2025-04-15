import java.util.Scanner;

public class clothshopbill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Basic Info ---
        System.out.println("====== Welcome to Cloth Shop ======");
        System.out.print("Enter Client Name: ");
        String clientName = sc.nextLine();

        System.out.print("Enter Bill Number: ");
        String billNumber = sc.nextLine();

        // --- Product Info ---
        final double BLUE_SHIRT_PRICE = 500;
        final double RED_SHIRT_PRICE = 400;
        final double SGST = 0.6;
        final double CGST = 0.6;


        System.out.print("Enter number of Blue Shirts: ");
        int blueQty = sc.nextInt();

        System.out.print("Enter number of Red Shirts: ");
        int redQty = sc.nextInt();
        double totalBlue = BLUE_SHIRT_PRICE * blueQty;
        double totalRed = RED_SHIRT_PRICE * redQty;
        boolean blueDiscountApplied = false;
        boolean redDiscountApplied = false;
        double finalblue = BLUE_SHIRT_PRICE * blueQty;
        double finalred = RED_SHIRT_PRICE * redQty;

        if (blueQty >= 10) {
            totalBlue *= 0.80; 
            blueDiscountApplied = true;
        }else{
            totalBlue = totalBlue;
            blueDiscountApplied = false;
        }
        if (redQty >= 10) {
            totalRed *= 0.85; 
            redDiscountApplied = true;
        }else {
            totalRed = totalRed;
            redDiscountApplied = false;
        }
        double grandTotal = totalBlue + totalRed;
        double gst = SGST + CGST;
        double finaltotal = grandTotal * gst;
        System.out.println("\n===============================");
        System.out.println("         CLOTH SHOP BILL       ");
        System.out.println("===============================");
        System.out.println("Client Name : " + clientName);
        System.out.println("Bill Number : " + billNumber);
        System.out.println("-------------------------------");
        System.out.printf("Item\t\tQty\tPrice\tDiscount\n");
        if (blueQty >= 10) {
            System.out.printf("Blue Shirt\t%d\t₹%.2f\t₹%.2f\n", blueQty, finalblue , totalBlue);
            if (blueDiscountApplied)
                System.out.println("  >> 20% DISCOUNT APPILED");
        }else{
            System.out.printf("blue Shirt \t%d\t₹%.2f\t₹%.2f\n", blueQty, finalblue , finalblue);
            System.out.println("  >> NO DISCOUNT APPLIED ");
        }
        if (redQty >= 10) {
            System.out.printf("Red Shirt \t%d\t₹%.2f\t₹%.2f\n", redQty, finalred , totalRed);
            if (redDiscountApplied)
                System.out.println("  >> 15% DISCOUNT APPILED");
        }else{
            System.out.printf("Red Shirt \t%d\t₹%.2f\t₹%.2f\n", redQty, totalRed, finalred);
            System.out.println("  >> NO DISCOUNT APPLIED ");
        }
        System.out.println("===============================");
        System.out.println(" CGST : " + CGST);
        System.out.println(" SGST : " + SGST);
        System.out.println("===============================");
        System.out.printf("Total Amount Payable: ₹%.2f\n", finaltotal, "$");
        System.out.println("===============================");
        System.out.println("     Thank you for shopping!   ");
        System.out.println("===============================");

        sc.close();
    }
}
