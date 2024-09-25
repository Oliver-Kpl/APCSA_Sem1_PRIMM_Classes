import java.lang.Math;

/**
 * Implements a class that encapsulates data and methods for representing a square
 * @author 
 * @version 1.0
 * @since 2024-09-
 */

class Square {
    /** The side length of the square **/
    private double side = 1.0;

    /** The perimeter of the square **/
    private double perimeter = 4.0;

    /** The area of the square **/
    private double area = 1.0;

    /**
     * Constructor
     * @param side double representing the side length. Assumes positive non-zero 
     */
    public Square(double side) {
        this.side = side;
        this.perimeter = 4 * side;
        this.area = side * side;
    }

    /**
     * Gets side length
     * @return double representing side
     */
    public double getSide() {
        return side;
    }

    /**
     * Gets perimeter
     * @return double representing perimeter
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Gets area
     * @return double representing area
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets side length. Perimeter and area are updated
     * @param s double representing the new side length.
     */
    public void setSide(double s) {
        side = s;
        perimeter = 4 * side;
        area = side * side;
    }

    /**
     * Sets area. Perimeter and side length are updated
     */
    public void setArea(double a) {
        area = a;
        side = Math.sqrt(area);
        perimeter = 4 * side;
    }

    /**
     * Sets perimeter. Area and side length are updated
     */
    public void setPerimeter(double p) {
        perimeter = p;
        side = perimeter / 4;
        area = side * side;
    }
}