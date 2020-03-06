package ua.myshapes;

import java.util.Random;

public class Triangle extends Shape {
	private static final String NAME = "Трехугольник";
	private double sideA;
    private double sideB;
    private double hypotenuse;
    
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
		int index = rand.nextInt(4);
        this.color = colorList.get(index);
    }
	
	public void setSideA() {
		Random rand = new Random();
        this.sideA = rand.nextInt(10) + 1;
    }
	
	public double getSideA() {
		return sideA;
	}
	
	public void setSideB() {
		Random rand = new Random();
        this.sideB = rand.nextInt(10) + 1;
    }
	
	public double getSideB() {
		return sideB;
	}
	
	public void setHypotenuse() {
		this.hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
	
	public double getHypotenuse() {
		return hypotenuse;
	}
	
	public double getPerimeter() {
        return sideA + sideB + hypotenuse;
	}
	
	public double getArea() {
        return sideA * sideB / 2;
	}
	
	public void draw() {
		System.out.println("Название: " + NAME);
		System.out.println("Цвет: " + getColor());
		System.out.println("Катет а: " + getSideA() + " ед.");
		System.out.println("Катет b: " + getSideB() + " ед.");
		System.out.println("Гипотенуза: " + String.format("%.2f", getHypotenuse()) + " ед.");
		System.out.println("Периметр: " + String.format("%.2f", getPerimeter()) + " ед.");
		System.out.println("Площадь: " + String.format("%.2f", getArea()) + " кв.ед.");
    }
}