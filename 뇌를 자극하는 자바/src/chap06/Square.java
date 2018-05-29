package chap06;

public class Square extends Rectangle{
	Square(int sideLength){
		super(sideLength,sideLength);
	}
	int getSidelength() {
		return (getWidth()+getHeight())*2;
		
	}
}
