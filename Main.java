import test.UseRoot;

public class Main {

    public static void main(String[] args) {
        Root root = new Root();
        root.setRoot("Java");
        System.out.println(root.getRoot());

        UseRoot useRoot = new UseRoot();
        useRoot.setUseRoot("Use Root is called");
        System.out.println(useRoot.getUseRoot());
    }
}