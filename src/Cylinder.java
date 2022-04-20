public class Cylinder extends Solid{
    private double radius, height;

    public Cylinder(double rad, double h, String type) {
        super(type);
        this.radius = rad;
        this.height = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public boolean equals(Object other) {
        if (this.radius == ((Cylinder)other).radius && this.height == ((Cylinder)other).height) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius of " + radius + ", and height of " + height;
    }

}