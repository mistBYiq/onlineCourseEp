package org.practice.decomposition;

import static org.practice.util.Util.enterPositiveDouble;

public class Decomposition03 {

    private static final int SIDE_OF_HEXAGON = 6;

    public static void main(String[] args) {
        System.out.println("Enter hexagon side ");
        double side = enterPositiveDouble();

        calculatedSquareHexagon(side);
    }

    public static void calculatedSquareHexagon(double side) {
        System.out.println("Square regular hexagon S = " + SIDE_OF_HEXAGON * calculateSquareTriangle(side));
    }

    public static double calculateSquareTriangle(double a) {
        // since the hexagon is regular means the six triangles it contains are equilateral.
        // and the area of an equilateral triangle is
        return (a * a * Math.sqrt(3)) / 4;
    }
}
