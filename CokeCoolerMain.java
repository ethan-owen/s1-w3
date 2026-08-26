public class CokeCoolerMain {
    public static void main(String[] args) {
        CokeCooler n1 = new CokeCooler();
        CokeCooler n2 = new CokeCooler(494);

        n1.refill(249);
        n2.drink(52);

        System.out.println(n1.cokeCount());
        System.out.println(n2.cokeCount());

        n1.drink(125);
        n2.refill(545);
    }
}
