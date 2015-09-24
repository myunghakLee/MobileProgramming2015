package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	//Implement here

	private int h;
	private int w;

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}

	public Rectangle(Point center, int w, int h)
	{
		this.center = center;
		this.h = h;
		this.w = w;
		
	}
	public int getWidth()
	{
		return w;	
	}
	public int getHeight()
	{
		return h;	
	}
	public Rectangle getBounds()
	{
		return this;	
	}

}