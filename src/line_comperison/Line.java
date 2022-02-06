package line_comperison;

import java.util.Scanner;

public class Line {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	     
		Scanner sc = new Scanner(System.in);
		  
	     System.out.println("Enter the value of x1 and x2"); 
	     
	 int x1 = sc.nextInt();
     int x2 = sc.nextInt();
        System.out.println("Enter the value of y1 and y2");
     int y1 = sc.nextInt();
     int y2 = sc.nextInt();
     Double dis1 = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1)); 
     System.out.println("Length of line of coordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1); 
       System.out.println("Enter the value of x3 and x4"); 
	 int x3 = sc.nextInt();
     int x4 = sc.nextInt();
       System.out.println("Enter the value of y3 and y4");
     int y3 = sc.nextInt();
     int y4 = sc.nextInt();
     Double dis2 = Math.sqrt((x4 - x3) * (x4 - x3)  +  (y2 - y1) * (y2 - y1));
     
     System.out.println("Length of line of coordinates"+"("+x1+","+x1+"),"+"("+y2+","+y2+")===>"+dis2);  
	
	
	if(dis1 == dis2)
      {
    	  System.out.println("both lines are equal");
      }
      else
      {
    	  System.out.println("both lines are diffrent");
      }
	}
}
  
