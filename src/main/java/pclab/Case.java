package pclab;

public class Case {

    //instance variables
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    //getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }


    //constuctor
    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    //powerbutton method
    void pressPowerButton() {
        System.out.println("Power Button Pressed");
    }
}
