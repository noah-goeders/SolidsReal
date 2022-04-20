public class Cone extends Solid{

    private double radius, height;

    public Cone(double rad, double h, String type) {
        super(type);
        this.radius = rad;
        this.height = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }

    @Override
    public double getSurfaceArea() { 
        return Math.PI * radius * (radius + Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2))));
    }

    @Override
    public String toString() {
        return super.toString() + ", radius of " + radius + ", and height of " + height;
    }
    
}