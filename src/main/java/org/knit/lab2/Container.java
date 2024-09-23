package org.knit.lab2;
import java.util.ArrayList;
import java.util.List;

public class Container {
    private double capacity;
    private double remainingVolume;
    private List<Shape> shapes;

    public Container(double capacity) {
        this.capacity = capacity;
        this.remainingVolume = capacity;
        this.shapes = new ArrayList<>();
    }

    public void add(Shape shape) {
        double volume = shape.getVolume();
        if (volume <= remainingVolume) {
            shapes.add(shape);
            remainingVolume -= volume;
            System.out.println("Фигура добавлена. Оставшийся объем: " + remainingVolume);
        } else {
            System.out.println("Недостаточно места для добавления фигуры. Оставшийся объем: " + remainingVolume);
        }
    }

    public double getRemainingVolume() {
        return remainingVolume;
    }

}

abstract class Shape {
    public abstract double getVolume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

