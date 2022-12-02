package NewPackage;

import java.util.Objects;
import java.util.Scanner;

 class CompareLine{
    int x1,x2,x3,x4,y1,y2,y3,y4;
    float line1,line2;
    public void getData()
    {
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
        System.out.println("The Length of line 1 is : "+line1);

        float line2 = (float) Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("The Length of line 2 is : "+line2);
    }
    public void EqualsTo()
    {
        if (Objects.equals(line1, line2)) {
            System.out.println(" Line 1 and Line 2 both are equal");
        }
        else{
            System.out.println(" line are not equal");
        }
//        System.out.println("the line 1 and line 2 both are equal"+ line1.equals(line2));
    }
    public void CompareTo(){
        System.out.println("Compare To Method Result:");
//        float res = line1.compareTo(line2);
        int compare = Float.compare(line1, line2);
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

    }
}

public class MainClass {
    public static void main(String[] args) {
        CompareLine l1 = new CompareLine();
        l1.getData();
        l1.EqualsTo();
        l1.CompareTo();
    }
}
