import java.awt.Color;
import java.awt.Graphics;

public abstract class Myshape {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color color;
	
	//set variable to zero
	public Myshape() {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.color = Color.BLACK;
	}
	//my constructor
	public Myshape(int x1, int y1, int x2, int y2, Color color) {
		this.x1 = Math.min(x1, x2);
		this.y1 = Math.min(y1, y2);
		this.x2 = Math.max(x1, x2);
		this.y2 = Math.max(y1, y2);
		this.color = color;
	}
	//set and get methods
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw(Graphics g);

}
