public class BoxDemo {
    public static void main(String[] args) {
        // Create first box
        BoxWeight box1 = new BoxWeight(2, 3, 4, 5);
        System.out.println("Box 1 details:");
        box1.display();

        // Create second box
        BoxWeight box2 = new BoxWeight(1.5, 2.5, 3.5, 4.5);
        System.out.println("\nBox 2 details:");
        box2.display();
    }
}
