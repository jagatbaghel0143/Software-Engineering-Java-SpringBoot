import test.UseRoot;

public class Main {

    public static void main(String[] args) {
        Root root = new Root();
        root.setRoot("Java");
        System.out.println(root.getRoot());

        UseRoot useRoot = new UseRoot();
        useRoot.setUseRoot("Use Root is called");
        System.out.println(useRoot.getUseRoot());

        Student s1 = new Student("Mohit", "20", "10/10/2010", "8979623884");
        s1.toString();

        //
        // JDK -> Platform Dependent
        // JRE+JVM -> 

        // FormulaOneCar Specifications
        System.out.println("\nFormula One Car Specifications:");
        FormulaOneCar car1 = new FormulaOneCar("15000 RPM", "100 Litres", "Soft", "1000 HP", "350 km/h");
        car1.toString();
    }
}