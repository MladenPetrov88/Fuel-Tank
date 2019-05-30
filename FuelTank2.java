import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelquantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;
        double gasDiscount = gas - 0.08;
        double dieselDiscount = diesel - 0.12;
        double gasolineDiscount = gasoline - 0.18;
        double gasNoCard = fuelquantity * gas;
        double dieselNoCard = fuelquantity * diesel;
        double gasolineNoCard = fuelquantity * gasoline;
        double gasCard = fuelquantity * gasDiscount;
        double dieselCard = fuelquantity * dieselDiscount;
        double gasolineCard = fuelquantity * gasolineDiscount;
        if (fuel.equals("Gas") && card.equals("Yes") && fuelquantity >=20 && fuelquantity <= 25) {
            double litres = gasCard - (gasCard * 0.08);
            System.out.printf("%.2f lv.", litres);
        } else if (fuel.equals("Gas") && card.equals("Yes") && fuelquantity > 25) {
            double litresMore = gasCard - (gasCard * 0.1);
            System.out.printf("%.2f lv.", litresMore);
        } else if (fuel.equals("Gas") && card.equals("Yes") && fuelquantity < 20) {
            System.out.printf("%.2f lv.", gasCard);
        } else if (fuel.equals("Gas") && card.equals("No")&& fuelquantity >=20 && fuelquantity <= 25) {
            double a = gasNoCard - (gasNoCard * 0.08);
            System.out.printf("%.2f lv.", a);
        } else if (fuel.equals("Gas") && card.equals("No") && fuelquantity > 25) {
            double b = gasNoCard - (gasNoCard * 0.1);
            System.out.printf("%.2f lv.", b);
        } else if (fuel.equals("Gas") && card.equals("No") && fuelquantity < 20) {
            System.out.printf("%.2f lv.", gasNoCard);
        }

        if (fuel.equals("Diesel") && card.equals("Yes") && fuelquantity >=20 && fuelquantity <= 25) {
            double a = dieselCard - (dieselCard * 0.08);
            System.out.printf("%.2f lv.", a);
        } else if (fuel.equals("Diesel") && card.equals("Yes") && fuelquantity > 25) {
            double b = dieselCard - (dieselCard * 0.1);
            System.out.printf("%.2f lv.", b);
        } else if (fuel.equals("Diesel") && card.equals("Yes") && fuelquantity < 20) {
            System.out.printf("%.2f lv.", dieselCard);
        } else if (fuel.equals("Diesel") && card.equals("No") && fuelquantity >=20 && fuelquantity <= 25) {
            double c = dieselNoCard - (dieselNoCard * 0.08);
            System.out.printf("%.2f lv.", c);
        } else if (fuel.equals("Diesel") && card.equals("No") && fuelquantity > 25){
            double d = dieselNoCard - (dieselNoCard * 0.1);
            System.out.printf("%.2f lv.", d);
        } else if (fuel.equals("Diesel") && card.equals("No") && fuelquantity < 20) {
            System.out.printf("%.2f lv.", dieselNoCard);
        }

        if (fuel.equals("Gasoline") && card.equals("Yes") && fuelquantity >=20 && fuelquantity <= 25) {
            double a = gasolineCard - (gasolineCard * 0.08);
            System.out.printf("%.2f lv.", a);
        } else if (fuel.equals("Gasoline") && card.equals("Yes") && fuelquantity > 25) {
            double b = gasolineCard - (gasolineCard * 0.1);
            System.out.printf("%.2f lv.", b);
        } else if (fuel.equals("Gasoline") && card.equals("Yes") && fuelquantity < 20) {
            System.out.printf("%.2f lv.", gasolineCard);
        } else if (fuel.equals("Gasoline") && card.equals("No") && fuelquantity >=20 && fuelquantity <= 25) {
            double d = gasolineNoCard - (gasolineNoCard * 0.08);
            System.out.printf("%.2f lv.", d);
        } else if (fuel.equals("Gasoline") && card.equals("No") && fuelquantity > 25) {
            double e = gasolineNoCard - (gasolineNoCard * 0.1);
            System.out.printf("%.2f lv.", e);
        } else if (fuel.equals("Gasoline") && card.equals("No") && fuelquantity < 20) {
            System.out.printf("%.2f lv.", gasolineNoCard);
        }

   }
 }


