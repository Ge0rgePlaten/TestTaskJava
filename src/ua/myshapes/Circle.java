package ua.myshapes;

import java.util.Random;

public class Circle extends Shape {
	private static final String NAME = "Круг";
	private double radius;
	
    public String getName() {
        return NAME;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius() {
    	Random rand = new Random();
        this.radius = rand.nextInt(10)+1;
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
	
	public double getCircumference() {
        return  2 * Math.PI * radius;
	}
	
	public double getArea() {
        return Math.PI * Math.pow(radius, 2);
	}
	
	public void draw() {
		System.out.println("Название: " + NAME);
		System.out.println("Цвет: " + getColor());
		System.out.println("Радиус: " + getRadius());
		System.out.println("Длина окружности: " + String.format("%.2f", getCircumference()) + " ед.");
		System.out.println("Площадь: " + String.format("%.2f", getArea()) + " кв.ед.");
    }
}