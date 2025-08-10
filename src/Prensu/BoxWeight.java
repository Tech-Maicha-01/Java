class BoxWeight extends Box {
    double weight;

    // Default constructor
    BoxWeight() {
        super(); // calls Box() constructor
        weight = 0;
    }

    // Parameterized constructor
    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h); // call Box(l, b, h)
        weight = w;
    }

    void display() {
        System.out.println("Volume: " + getVolume());
        System.out.println("Weight: " + weight);
    }
}
