package lesson4.task2;

public interface Shape {

    double getArea();
    double getPerimeter();
    String getFillColor();
    String getBorderColor();

    default double calculatePerimeter(double... sides) {
        double perimeter = 0;

        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
