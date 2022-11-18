package P2_Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }


    public Double getHeight() {
        return this.height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    private void setWidth(Double width) {
        this.width = width;
    }

    public Double getWidth() {
        return this.width;
    }

    @Override
    protected void calculatePerimeter() {
       setPerimeter(2 * (this.height * width));
    }

    @Override
    protected void calculateArea() {
        setArea(this.height * this.width);
    }
}
