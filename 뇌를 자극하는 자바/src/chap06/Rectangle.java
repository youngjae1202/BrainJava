package chap06;

public class Rectangle {
	private int width, height; //private 보다 protected를  사용한다
	public Rectangle(int width,int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
