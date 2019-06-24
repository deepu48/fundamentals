package deep1;

 class Box1 {
	double length;
	double width;
	double height;
	 double volume()
	 {
		 return(length*width*height);
		 }

}
public  class Box1Demo
 {
	 public static void main(String args[])
	 {
		 Box1 b = new Box1();
		 b.length=15;
		 b.width=20;
		 b.height=20;
		 System.out.println(b.volume());
	 }
 }