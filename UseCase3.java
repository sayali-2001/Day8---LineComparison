package NewPackage;

import java.util.Scanner;

public class UseCase3 {
    UseCase3(){ //Constructor
        int x1,x2,x3,x4;
        int y1,y2,y3,y4;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the X and Y co-ordinates for first point of line 1 : ");
        x1=scanner.nextInt();
        y1=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 1 :");
        x2=scanner.nextInt();
        y2=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for first point of line 2 : ");
        x3=scanner.nextInt();
        y3=scanner.nextInt();

        System.out.println("Enter the X and Y co-ordinates for second point of line 2 : ");
        x4=scanner.nextInt();
        y4=scanner.nextInt();

        float line1 = (float) Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("the distance of line 1 is : "+line1);
        float line2 = (float) Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("the distance of line 2 is : "+line2);

        System.out.println("_____________________________________________________");
        System.out.println("Compare To Method Result");

        float compare = Float.compare(line1, line2);
        if(compare < 0) {
            System.out.println("Line 1 is smaller than Line 2.");
        }
        else if(compare > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        }
        else {
            System.out.println("Line 1 is equals to the Line 2.");
        }
    }
    public static void main(String[] args) {
        UseCase3 obj = new UseCase3();
    }
}
