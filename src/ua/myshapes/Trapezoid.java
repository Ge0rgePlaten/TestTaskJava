package ua.myshapes;

import java.util.Random;

public class Trapezoid extends Shape {
	
	private static final String NAME = "Трапеция";
	private double side;
	private double sideShort;
	private double sideLong;

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
    	this.side = rand.nextInt(10) + 1;
    }
    
    public double getSideShort() {
        return sideShort;
    }
    
    public void setSideShort() {
    	Random rand = new Random();
    	this.sideShort = rand.nextInt(10) + 1;
    }
    
    public double getSideLong() {
        return sideLong;
    }
    
    public void setSideLong() {
    	Random rand = new Random();
    	double qwe = rand.nextInt(10) + 1; ///�������� ����������
    	while (2 * side + sideShort <= qwe | sideShort >= qwe) {
    		qwe = rand.nextInt(10) + 1;
		}
    	this.sideLong = qwe;
    }    
    
    public double getArea() {
        return (sideLong + sideShort) / 2 * Math.sqrt(Math.pow(side, 2) - Math.pow(Math.pow(sideLong - sideShort, 2) / (2 * (sideLong - sideShort)), 2));
	}
	
	public double getPerimeter() {
        return 2 * side + sideShort + sideLong;
	}
	
	public void draw() {
		System.out.println("Название: " + NAME);
		System.out.println("Цвет: " + getColor());
		System.out.println("Боковая сторона: " + getSide() + " ед.");
		System.out.println("Верхняя основа: " + getSideShort() + " ед.");
		System.out.println("Нижняя основа: " + getSideLong() + " ед.");
		System.out.println("Периметр: " + getPerimeter() + " ед.");
		System.out.println("Площадь: " + String.format("%.2f", getArea()) + " кв.ед.");
    }
}
