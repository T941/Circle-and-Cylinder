public class Circle {
    public double radius=1.0;
public Circle(){

}
public Circle(double radius){
    this.radius=radius;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
    return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
    return  "A Circle: radius = " + radius+", area = "+getArea();
    }
}
