package ua.myshapes;

import java.util.Random;

public class Square extends Shape {
	
	private static final String NAME = "Квадрат";	
	private double side;
    
    public  String getName() {
		return NAME;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor() {
		colorList.add("Красный");
		colorList.add("Зеленый");
		colorList.add("Синий");
		colorList.add("Розовый");
		colorList.add("Желтый");
		
		Random rand = new Random();
        this.color = colorList.get(rand.nextInt(4));
    }
	
    public double getSide() {
        return side;
    }
    
    public void setSide() {
    	Random rand = new Random();
    	this.side = rand.nextInt(10)+1;
    }
    
	public double getArea() {
        return side * side;
	}
	
	public double getPerimeter() {
        return 4 * side;
	}
	
	public void draw() {
		System.out.println("Название: " + NAME);
		System.out.println("Цвет: " + getColor());
		System.out.println("Длина стороны: " + getSide() + " ед.");
		System.out.println("Периметр: " + getPerimeter() + " ед.");
		System.out.println("Площадь: " + getArea() + " кв.ед.");
    }
}
