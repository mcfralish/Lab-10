import java.awt.*;
public class Lab10 {
	
	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel(1000,1000);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.gray);
		
		Circle c1 = new Circle((int)(Math.random()*1000), (int)(Math.random()*1000), Math.random()*100);
		Circle c2 = new Circle((int)(Math.random()*1000), (int)(Math.random()*1000), Math.random()*100);
		Circle c3 = new Circle((int)(Math.random()*1000), (int)(Math.random()*1000), Math.random()*100);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		c1.draw(g);
		c2.draw(g);
		c3.draw(g);
	}

}
