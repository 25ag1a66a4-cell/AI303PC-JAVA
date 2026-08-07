// Parent class
class privatedemop {
    private int value = 42;
    private void printValue() {
        System.out.println("Value from parent: " + value);
    }
}
class pridemoc extends privatedemop {

    public void Access() {
    
    }
}

public class Main {
    public static void main(String[] args) {
        pridemoc child = new pridemoc();
        child.testAccess();
    }
}