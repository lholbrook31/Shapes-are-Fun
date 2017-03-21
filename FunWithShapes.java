/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithshapes;

/**
 *
 * @author Logan
 */
public class FunWithShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double length, width;
        system.out.print("Enter in the Length and width of the square so we can calculate the area\n");
        length = system.in.read();
        width = system.in.read();
        double area = calcArea(length,width);
        system.out.print("The area of the square with length " + length + " and " + width + " is " + area + ".\n");
        
        double triBase = 5;
        double triHeight = 5.4;
        System.out.println(new AreaOfTriangle().getArea(triBase, triHeight));
        
        double pybase = 5;
        double pyheight = 8.9;
        System.out.println(new VolumeOfPyramid(pybase, pyheight).getVolume());
        
        System.out.println("Area of a circle test cases:");
          
 +        if(circleArea(1) == -1) {
 +            System.out.println("Test case 1 failed");
 +        } else {
 +            System.out.println("Test case 1 passed");
 +        }
 +          if(circleArea(-1) == -1) {
 +            System.out.println("Test case -1 success");
 +        }
 +        else {
 +            System.out.println("Test case -1 failed");
 +        }
 +          if(circleArea(0) == -1) {
 +            System.out.println("Test case 0 failed");
 +        }
 +        else {
 +            System.out.println("Test case 0 passed");
 +        }
 +          if(circleArea(5.5) == -1) {
 +            System.out.println("Test case 5.5 failed");
 +        }
 +        else {
 +            System.out.println("Test case 5.5 passed");
 +        }
 +      
 +    }
    }
    
}
