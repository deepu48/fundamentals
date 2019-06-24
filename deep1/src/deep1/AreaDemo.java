package deep1;



class Area {
	double length;
	double height;
	 double area()
	 {
		 return(length*height);
		 }

}
public  class AreaDemo
{
	 public static void main(String args[])
	 {
		 Area a = new Area();
		 a.length=15;
		 a.height=20;
		 System.out.println(" The Area is"+ a.area());
	 }
}