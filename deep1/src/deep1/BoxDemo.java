package deep1;

 class Box {
	double length;
	double width;
	double height;
	

}

public class BoxDemo
{
	public static void main(String args[])
	{
		Box b = new Box();
		b.length=5;
		b.width=10;
		b.height=15;
		System.out.println(b.length*b.width*b.length);
		
	}
}