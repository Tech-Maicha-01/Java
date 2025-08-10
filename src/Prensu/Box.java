class Box {
    double length;
    double breadth;
    double height;

    // Default constructor
    Box() {
        length = breadth = height = 0;
    }

    // Parameterized constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double getVolume() {
        return length * breadth * height;
    }
}
