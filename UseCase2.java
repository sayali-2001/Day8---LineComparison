package NewPackage;

import java.util.Objects;
import java.util.Scanner;

public class UseCase2 {

    private void lineComparison(){ //Method
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
        System.out.println("Length of line 1 is : "+line1);
        float line2 = (float) Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("Length of line 2 is : "+line2);

        if (Objects.equals(line1, line2)) {
            System.out.println("Line 1 and Line 2 both are equal");
        }
        else {
            System.out.println("Line are not equal");
        }
    }
    public static void main(String[] args) {
        UseCase2 obj = new UseCase2();
        obj.lineComparison();
    }
}
