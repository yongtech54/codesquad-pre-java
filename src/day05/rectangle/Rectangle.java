package day05.rectangle;

public class Rectangle {
    int x;
    int y;
    int width;
    int height;
    int area;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int square() {
        area = width * height;
        return area;
    }

    void show() {
        String coordinate = "(" + x + "," + y + ")";
        String size = width + "x" + height;

        System.out.println(coordinate + "에서 크기가 " + size + "인 사각형");
    }

    boolean contains(Rectangle r) {
        boolean rowRange = (this.x + this.width) > (r.x + r.width);
        boolean colRange = (this.y + this.height) > (r.y + r.height);
        if (rowRange && colRange) {
            return true;
        }
        return false;
    }
}
