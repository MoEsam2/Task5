package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
    static ShapeArea shapeArea=new ShapeArea();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double>ListOfRadius=new ArrayList<>();
        System.out.println("For Circular area(Enter0) or Rectangular area(Enter 1)");
        int num=in.nextInt();

        if(num == Shape.CIRCLE.ordinal())
         {
            while(true)
            {
                System.out.println("Enter any radius (-1 to quit) :");
                double radius=in.nextDouble();
                if(radius!=-1)
                {
                    ListOfRadius.add(radius);
                }
                else
                    break ;
            }
                PrintCircularArea(ListOfRadius);
         }

        else if (num == Shape.RECTANGLE.ordinal())
         {
             System.out.println("Enter length and width of the Rectangle");
             double length=in.nextDouble();
             double width=in.nextDouble();
             System.out.println("Rectangular Area : "+shapeArea.Area(length,width));
         }

    }
    public static void PrintCircularArea(ArrayList list)
    {
        for (int i=0;i<list.size();i++)
        {
            System.out.println("Circular Area for "+(i+1)+"th radius "+shapeArea.Area((Double) list.get(i)));
        }
    }
     enum Shape
    {
        CIRCLE,RECTANGLE;
    }
}
/*
1:Inheritance
2:Compilation
3:at compile time
4:Encapsulation
5:True
 */