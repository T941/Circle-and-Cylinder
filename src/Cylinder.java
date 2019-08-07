public class Cylinder extends Circle {
    public double height = 1.0;
    public Cylinder(){}
    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*getArea();
    }
    @Override
    public String toString(){
       return  "A Cylinder: radius = "+radius+", height = "+height+", volume = "+getVolume()+", which is a subclass of "+ super.toString();
    }
}




