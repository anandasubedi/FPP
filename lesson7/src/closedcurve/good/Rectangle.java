package closedcurve.good;

public class Rectangle extends ClosedCurve{
double lenght;
double width;
public Rectangle(double length,double width){
	this.lenght=length;
	this.width=width;
}
	@Override
	double computeArea() {
	return lenght*width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

}
