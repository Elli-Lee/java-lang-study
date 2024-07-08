package basic.oop1.ex;

public class Rectangle {
    int height;
    int width;

    int calculateArea () {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
