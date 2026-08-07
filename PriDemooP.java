class PriDemooP {
    protected int z = 22;
}


class PridemoD extends PriDemooP {
    private int y = 20;

    public static void main(String... args) {
        PriDemoD pdd = new PriDemoD();
        System.out.println(pdd.y);
        System.out.println(pdd.z);
    }
}