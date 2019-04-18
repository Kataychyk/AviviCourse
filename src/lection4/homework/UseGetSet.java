package lection4.homework;

import lection4.homework.triangle.TriangleGetSet;

public class UseGetSet {

    public static void main(String[] args) {

        TriangleGetSet triangle = new TriangleGetSet(20,20);

        System.out.println("Length = " + triangle.getLength());
        System.out.println("Length = " + triangle.getWidth());
        triangle.setLength(10);
        triangle.setWidth(10);
        System.out.println("Length = " + triangle.getLength());
        System.out.println("Length = " + triangle.getWidth());

    }
}
