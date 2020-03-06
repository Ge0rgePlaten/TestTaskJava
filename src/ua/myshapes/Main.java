package ua.myshapes;

//import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//ArrayList<Object> shapeObject = new ArrayList<Object>();
		Random rand = new Random();
		for(int i = 0; i < (rand.nextInt(3) + 1); i++) {
			Square mySqu = new Square();
			mySqu.setColor();
			mySqu.setSide();
			mySqu.draw();
			
			System.out.println();
		}
		
		for(int i = 0; i < (rand.nextInt(3) + 1); i++) {
			Circle myCir = new Circle();
			myCir.setColor();
			myCir.setRadius();
			myCir.draw();
			
			System.out.println();
		}

		for(int i = 0; i < (rand.nextInt(3) + 1); i++) {
			Trapezoid myTrp = new Trapezoid();
			myTrp.setColor();
			myTrp.setSide();
			myTrp.setSideShort();
			myTrp.setSideLong();
			myTrp.draw();
			
			System.out.println();
		}
		
		for(int i = 0; i < (rand.nextInt(3) + 1); i++) {
			Triangle myTri = new Triangle();
			myTri.setColor();
			myTri.setSideA();
			myTri.setSideB();
			myTri.setHypotenuse();
			myTri.draw();
			
			System.out.println();
		}

	}

}