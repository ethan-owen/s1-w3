public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar c1 = new CandyJar();
        CandyJar c2 = new CandyJar(8);

        c1.eatCandy(3);
        c2.refillCandy(222);

        c1.printState();
        c2.printState();

        c2.eatCandy(119);
        c1.refillCandy(64);

        c1.printState();
        c2.printState();
    }
}
