
public class RectangleArea extends Shapes {
	

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return super.getLength();
	}
	
	@Override
	public int getBredth() {
		// TODO Auto-generated method stub
		return super.getBredth();
	}
	
	@Override
	public void CalculateArea(){
		
		int area = 0;
		
		area = getLength() * getBredth();
		
		System.out.println("Area of rectangle is :"+area);
		
	}

}
