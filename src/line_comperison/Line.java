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
     
      double dis;
      dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      System.out.println("calculate its length" +dis);
	}

}
