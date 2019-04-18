package lection4;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println((width+height+depth));
    }

    void setDim(double width, double h, double d){
        this.width = width;
        height = h;
        depth = d;
    }
}
