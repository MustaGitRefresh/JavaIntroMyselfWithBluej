import java.util.Scanner;
public class Electric_bill_calculator {
    // Declaration of variables
    double total, rate;
    int units, previous_month_units, current_units;
    String date;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        previous_month_units = sc.nextInt();
        current_units = sc.nextInt();
        date = sc.next();
        Conditionals();
    }

    public void Conditionals(){
        rate = 0;
        if (units <= 150){
            rate = 4.75;
        }
        if (units <= 200){
            rate = 5.50;
        }
         if (units <= 250){
            rate = 6.75;
        }
        if (units <= 600){
            rate = 7;
        }
        else {
            rate = 8;
        }
    }


    public void UnitCalculator(){
        if (previous_month_units > current_units) {
            units = previous_month_units - current_units;
        }

        else {
            units = current_units - previous_month_units;
        }
    }
    public void TotalAmount(){
        total = rate * units;
    }

    public void Display(){
        System.out.println(rate);
        System.out.println(units);
        System.out.println("The electric bill");
        System.out.println("The month " + date);
        System.out.println("The previous reading " + previous_month_units);
        System.out.println("The current reading " + current_units);
        System.out.println("The total bill " + total);
    }

    public static void main(String[] args) {
        Electric_bill_calculator ebc = new Electric_bill_calculator();
        ebc.Input();
        ebc.UnitCalculator();
        ebc.TotalAmount();
        ebc.Display();

    }
}
