import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    @DisplayName("非整数,请输入整数")
    void integer_test() {
        Triangle triangle = new Triangle();
        String type = triangle.JudegeTriangele(3,4.5, 5);
        assertEquals("非整数,请输入整数", type);
        type = triangle.JudegeTriangele(3.5,4, 5);
        assertEquals("非整数,请输入整数", type);
        type = triangle.JudegeTriangele(3,4, 5.1);
        assertEquals("非整数,请输入整数", type);
    }

    @Test
    @DisplayName("输入错误，请输入1-100之间的数字")
    void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.JudegeTriangele(50, 50, 0);
        assertEquals("输入错误，请输入1-100之间的数字", type);

        type = triangle.JudegeTriangele(1, 4, 101);
        assertEquals("输入错误，请输入1-100之间的数字", type);

        type = triangle.JudegeTriangele(1, 101, 4);
        assertEquals("输入错误，请输入1-100之间的数字", type);

        type = triangle.JudegeTriangele(0, 50, 50);
        assertEquals("输入错误，请输入1-100之间的数字", type);

        type = triangle.JudegeTriangele(50, 0, 50);
        assertEquals("输入错误，请输入1-100之间的数字", type);

        type = triangle.JudegeTriangele(101, 50, 50);
        assertEquals("输入错误，请输入1-100之间的数字", type);
    }

    @Test
    @DisplayName("不等边三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.JudegeTriangele(50 ,  51, 100  );
        assertEquals("不等边三角形", type);

        type = triangle.JudegeTriangele(2, 5, 4);
        assertEquals("不等边三角形", type);

        type = triangle.JudegeTriangele(99, 50,51 );
        assertEquals("不等边三角形", type);
    }

    @Test
    @DisplayName("非三角形")
    void triangle_test() {
        Triangle triangle = new Triangle();

        String type = triangle.JudegeTriangele(50, 50, 100);
        assertEquals("非三角形", type);

        type = triangle.JudegeTriangele(1, 50, 100);
        assertEquals("非三角形", type);

        type = triangle.JudegeTriangele(1, 50, 99);
        assertEquals("非三角形", type);

        type = triangle.JudegeTriangele(2, 50, 99);
        assertEquals("非三角形", type);

        type = triangle.JudegeTriangele(2, 50, 100);
        assertEquals("非三角形", type);
    }

    @Test
    @DisplayName("等边三角形")
    void equilateral_triangle_test() {
        Triangle triangle = new Triangle();
        String type = triangle.JudegeTriangele(1, 1, 1);
        assertEquals("等边三角形", type);

        type = triangle.JudegeTriangele(100, 100, 100);
        assertEquals("等边三角形", type);

        type = triangle.JudegeTriangele(2, 2, 2);
        assertEquals("等边三角形", type);

        type = triangle.JudegeTriangele(99, 99, 99);
        assertEquals("等边三角形", type);

        type = triangle.JudegeTriangele(50, 50, 50);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName("等腰三角形")
    void isosceles_test() {
        Triangle triangle = new Triangle();
        String type = triangle.JudegeTriangele(50, 50, 1);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(50, 50, 2);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(50, 50, 99);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(2, 2, 1);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(99, 99, 1);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(2, 99, 99);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(2, 100, 100);
        assertEquals("等腰三角形", type);

        type = triangle.JudegeTriangele(100, 100, 1);
        assertEquals("等腰三角形", type);
    }

}
