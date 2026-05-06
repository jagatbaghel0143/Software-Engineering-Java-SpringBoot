import test.UseRoot;

public class Main {

    public String name;
    public int rollNo;

    public static void main(String[] args) {
        String name;
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
    }
}