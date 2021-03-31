package pclab;

public class PC {

//Instance variables for constructors
    private Case aCase;
    private Motherboard motherboard;
    private Monitor monitor;


    //IntelliJ generated constuctor
    public PC(Case aCase, Motherboard motherboard, Monitor monitor) {
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    //drawlogo Method
    private void drawLogo() {
        monitor.drawPixel(6,9,"yellow");
    }
    //description method
    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.printf("%22s-%22s-%22s-%22s\n", "Manufacturer", "Model", "Power Supply", "Dimensions");
        System.out.printf("%22s-%22s-%22s-%22s\n", aCase.getManufacturer(), aCase.getModel(), aCase.getPowerSupply(), aCase.getDimension());
        System.out.print("\n");
        System.out.printf("%22s-%22s-%22s\n", "Manufacturer", "Model", "Resolution");
        System.out.printf("%22s-%22s-%22s\n", monitor.getManufacturer(), monitor.getModel(), monitor.getResolution());
        System.out.print("\n");
        System.out.printf("%22s-%22s-%22s-%22s-%22s\n", "Manufacturer", "Model", "RAM SLOTS", "CARD SLOTS", "BIOS");
        System.out.printf("%22s-%22s-%22s-%22s-%22s\n", motherboard.getManufacturer(), motherboard.getModel(), motherboard.getRamSlots(), motherboard.getCardSlots(), motherboard.getBios());
    }

    public void powerUp() {
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("");
    }
}
