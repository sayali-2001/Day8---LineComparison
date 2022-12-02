package NewPackage;

import java.util.Scanner;

public class UseCase1 {
    int x1,x2;
    int y1,y2;
    UseCase1(int x1 , int x2, int y1, int y2){ //Parameterised Constructor
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }
    private void lineComparison(){ //Method

        float line1 = (float) Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of line 1 is : "+line1);
    }

    public static void main(String[] args) {
      UseCase1 obj = new UseCase1(10,15,20,14);
      obj.lineComparison();
    }
}
