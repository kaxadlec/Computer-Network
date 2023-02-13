package HW0213;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> Square = findShapesByType(Shape.shapes, "사각형");
        System.out.print("사각형 : ");
        System.out.println(Square);
        List<Shape> RedSmall = findShapesByColorNArea(Shape.shapes, "빨간색", 12.0);
        System.out.print("빨간 도형(면적<=12.0) : ");
        System.out.println(RedSmall);
    }

    static List<Shape> findShapesByType(List<Shape> shapes, String type) {

        List<Shape> result = new ArrayList<>();

        for (Shape t : shapes)
        {
            if (t.getType().equals(type))
                result.add(t);
        }
        return result;
    }

    static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, Double area) {
        List<Shape> result = new ArrayList<>();

        for (Shape t : shapes)
        {
            if (t.getColor().equals(color) && t.getArea() <= area)
                result.add(t);
        }
        return result;
    }



}
