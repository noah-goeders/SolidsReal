public class Sphere extends Solid {

    private double radius;

    public Sphere(double radius, String type) {
        super(type);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4/3 * Math.PI * radius;
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}