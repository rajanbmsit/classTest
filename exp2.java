package classTest;

class shape{
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
}

class Circle extends shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}

class Square extends shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Square");
	}
	public void erase()
	{
		System.out.println("Erasing Square");
	}
}

class Triangle extends shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.draw();
		c.erase();
		Square s=new Square();
		s.draw();
		s.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		

	}

}
