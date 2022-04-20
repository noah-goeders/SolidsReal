public class Solid {

    private String type;

    public Solid(String type){
        this.type = type;
    }

    public double getVolume() {
        return 0;
    }

    public double getSurfaceArea() {
        return 0;
    }

    public String toString() {
        return "A " + type + " with volume " + getVolume();
    }

    public boolean equals(Object other) {
        if (this.getVolume() == ((Solid)other).getVolume()) {
            return true;
        }
        return false;
    }



}