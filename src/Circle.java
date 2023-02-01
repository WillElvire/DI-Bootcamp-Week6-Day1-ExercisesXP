public class Circle {
   private double radius  = 1.0;
   private String color   = "red" ;

   Circle(){
    super();
   }

   Circle(double radius){
    super();
    this.radius  = radius;
   }

   Circle(double radius , String color) {
    super();
    this.radius  = radius;
    this.color   = color;
   }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    public double  getArea() {
     return  Math.PI*Math.pow(radius, 2);
    }
    
   
}
