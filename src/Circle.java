import java.awt.*;
public class Circle {
	
	static int numCircs;
	
	private int circuitID = 1;
	private double radius;
	private Point center;
	
	public Circle(int x, int y, double rad) {
		numCircs++;
		radius=rad;
		center = new Point(x,y);
		circuitID = numCircs;
	}
	
	public String toString() {
		return "Circle "+circuitID+"\nCenter: "+center.toString()+"\nRadius: "+radius;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(center.getX(), center.getY(), (int)radius, (int)radius);
		g.drawString(""+circuitID, center.getX(), center.getY());
	}
	
	public Point getCenter() {
		return center;
	}
	
	public double getRad() {
		return radius;
	}
	
	public void setRad(double rad) {
		radius=rad;
	}
	
	public void setCenter(int x, int y) {
		center = new Point(x,y);
	}

}
