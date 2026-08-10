public class FormulaOneCar {

    public String RPMLimit;
    public String fuelCapacity;
    public String tyreType;
    public String enginePower;
    public String topSpeed;

    //Constructor
    public FormulaOneCar(String RPMLimit, String fuelCapacity, String tyreType, String enginePower, String topSpeed) {
        this.RPMLimit = RPMLimit;
        this.fuelCapacity = fuelCapacity;
        this.tyreType = tyreType;
        this.enginePower = enginePower;
        this.topSpeed = topSpeed;
    }

    //toString method
    public String toString() {
        System.out.println("RPM Limit: " + RPMLimit);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Tyre Type: " + tyreType);
        System.out.println("Engine Power: " + enginePower);
        System.out.println("Top Speed: " + topSpeed);
        return "";
    }
    
}
