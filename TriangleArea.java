
public class TriangleArea extends Shapes{
	
	
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}
	
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}
	
	@Override
	public void CalculateArea(){
		
		int area=0;
		area= (getWidth() * getHeight())/2;
		System.out.println("Area of Triangle is: "+area);
		
	}

}
