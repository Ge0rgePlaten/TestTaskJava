package ua.myshapes;

import java.util.ArrayList;

public abstract class Shape {
	public String color;
	public ArrayList<String> colorList = new ArrayList<String>();
	
    public abstract String getName();
    public abstract String getColor();
    public abstract double getArea();
    public abstract void draw();
}