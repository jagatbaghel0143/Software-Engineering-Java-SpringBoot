import test.TestTest;

public class Root extends TestTest {
    private String priRoot;
    public String pubRoot;


    public void setRoot(String root) {
        this.priRoot = root;
    }

    public String getRoot() {
        return priRoot;
    }
    
    //SOLID Principles
    //School -> schoolName, schoolBuses, uptoClasses, numberOfTeachers, affiliated, board
    //Student -> name, age, class, subjects
}
