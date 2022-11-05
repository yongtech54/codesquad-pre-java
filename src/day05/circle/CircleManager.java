package day05.circle;

import java.util.Scanner;

class Circle {

    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        String center = "(" + x + "," + y + ")";

        System.out.println(center + " " + radius);
    }
}
public class CircleManager {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circle[] circles = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            System.out.print((i + 1) + "번째 원의 x, y, radius >> ");
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            int radius = scan.nextInt();

            circles[i] = new Circle(x, y, radius);
        }

        for (int i = 0; i < circles.length; i++) {
            circles[i].show();
        }

        scan.close();
    }
}
