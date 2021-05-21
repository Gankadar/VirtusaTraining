public abstract Shape{
  abstract void claculateArea();
  public void setColor(String str){
	String s = str;
	System.out.println(s);	
   }

 class Square extends Shape{
	public void calculateArea(){
		double length = 4.0;
		double width = 4.0;
	System.out.println("Area : " + length*width);
	
       }
  }
 class Circle extends Shape{
	public void calculaeArea(){
		double radius = 5.0;
		double  pi = 3.14;
	System.out.println("Area : " + 2*pi*radius*radius);
	
	}
  } 
}

class AbstractTest{
	public static void main(String args[]){
		Circle c = new Circle();
		c.calculateArea();
		c.setColor("Blue");
		Square s = new Square();
		s.calculateArea();
		s.setColor("white");	
 }	
}
