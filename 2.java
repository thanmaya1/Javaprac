class Cuboid {
    private double l, b, h;

    // constructor with three arguments
    public Cuboid(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    // setter methods
    public void setLength(double l) {
        this.l = l;
    }
    public void setWidth(double b) {
        this.b = b;
    }
    public void setHeight(double h) {
        this.h = h;
    }

    // getter methods
    public double getLength() {
        return l;
    }
    public double getWidth() {
        return b;
    }
    public double getHeight() {
        return h;
    }

    public double getVolume() {
        return l * b * h;
    }

    public double getSurfaceArea() {
        return 2 * (l * b + b * h + h * l);
    }

    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(5, 10, 15);
        System.out.println("Cuboid 1:");
        System.out.println("Length: " + c1.getLength());
        System.out.println("Width: " + c1.getWidth());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println("Surface Area: " + c1.getSurfaceArea());
    }
}
