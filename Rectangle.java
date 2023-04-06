import java.util.Scanner;
/**
 This program basically calculates the area of the rectangle.
 */
public class Rectangle
{
    int length, breadth, area;
    
    // Methods
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = in.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        breadth = in.nextInt();
    }
    
    public void Calculate(){
        area = length * breadth;
    }
    
    public void Display(){
        System.out.println("The lenght of the rectangle is = " + length);
        System.out.println("The breadth of the rectangle is = " + breadth);
        System.out.println("The area of the rectangle is = " + area);
    }
    
    public static void main(String[] args){
        Rectangle ob = new Rectangle();
        ob.Input();
        ob.Calculate();
        ob.Display();
    }
}
