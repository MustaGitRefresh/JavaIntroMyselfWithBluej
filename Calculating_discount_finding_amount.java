import java.util.Calendar;
import java.util.Scanner;
public class Calculating_discount_finding_amount {
    // Attributes
    int cost, discount, amount;

    // Methods / behaviours
    public void Accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of Tv");
        cost = sc.nextInt();
        System.out.println("Enter the discount");
        discount = sc.nextInt();
    }

    public void Calculate(){
        amount = cost - discount;
    }

    public void Display(){
        System.out.println("The amount after discount is = " + amount);
    }

    public static void main(String[] args) {
        Calculating_discount_finding_amount cd = new Calculating_discount_finding_amount();
        cd.Accept();
        cd.Calculate();
        cd.Display();
    }
}
