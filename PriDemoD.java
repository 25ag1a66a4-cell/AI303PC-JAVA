public class PriDemoD {
    private int x = 20;
    int z = 22;

    private void display() {
        PriDemoD pdp = new PriDemoD();
        System.out.println(pdp.x);
    }

    public static void main(String[] args) {
        PriDemoD pdp = new PriDemoD();
        pdp.display();
    }
}