import java.util.Scanner;

public class AreaOfShapesAssignment1 extends Shapes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleArea ra = new RectangleArea();
		TriangleArea ta = new TriangleArea();
		
		System.out.println("Let's calculate the area of Rectangle!!");
		System.out.println("Please enter the length of the Rectangle :");
		Scanner sc = new Scanner(System.in);
		ra.setLength(sc.nextInt());
		System.out.println("Enter the Breadth of the rectangle");
		ra.setBredth(sc.nextInt());
		
		ra.CalculateArea();
		
		System.out.println("Let's calculate the area of Triangle!!");
		System.out.println("Please enter the height of the Triangle :");
		ta.setHeight(sc.nextInt());
		System.out.println("Enter the width of the Triangle");
		ta.setWidth(sc.nextInt());
		
		sc.close();
		
		ta.CalculateArea();
		

	}

}
