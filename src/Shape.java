
public interface Shape {
void shape();
}
class Rectangle implements Shape{

	@Override
	public void shape() {
		System.out.println("This is Rectangle shape");
		int l=5, b=5;
		float t=0.5f;
		int r=(int) (t*l*b);
		System.out.println("Area of Rectangle:"+r);
	}
	
}
class Circle implements Shape{

	@Override
	public void shape() {
		System.out.println("This is Circle shape");
		int r=5;
		float pi=3.14f;
		int s=(int) (pi*r*r);
		System.out.println("Area of Circle:"+s);
	}
	
}
class TestInterface{
	public static void main(String args[]){
		Shape obj=new Circle();
		Shape ob=new Rectangle();
		obj.shape();
		ob.shape();
	}
}
