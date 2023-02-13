package HW0213;

public class Shape {
    private String type;
    private String color;
    private Double area;

    public Shape(String type, String color, Double area) {
        this.type = type;
        this.color = color;
        this.area = area;
    }
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getArea() {
        return area;
    }
    
}
