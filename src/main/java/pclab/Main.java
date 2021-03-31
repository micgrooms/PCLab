package pclab;

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(10, 80);
        Dimension dimension = new Dimension(4, 13, 10);
        Case acase = new Case("W", "APPLE", "Battery", dimension);
        Monitor monitor = new Monitor(resolution, "APPLE", "B");
        Motherboard motherboard = new Motherboard("D", "APPLE", 2, 2, "BIOS");
        PC lapTop = new PC(acase, motherboard, monitor);

        lapTop.description();
        System.out.println();
        lapTop.powerUp();
    }
}
