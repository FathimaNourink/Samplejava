
public class Triangle extends Shape {
int height = 3;
public void displayh()
{
	System.out.println("The height of triangle is: "+height);
	
}
public static void main (String[]args)
{
	Triangle t=new Triangle();
	t.display();
	t.displayh();
	Circle c = new Circle();
	c.displayr();
}
}