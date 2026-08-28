public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();
        Score s1 = new Score(26);

        System.out.println(s.currentScore());
        System.out.println(s1.currentScore());

        s.increase(7);
        s1.decrease(43);

        System.out.println(s.currentScore());
        System.out.println(s1.currentScore());

        s.decrease(18);
        s1.increase(53);

        System.out.println(s.currentScore());
        System.out.println(s1.currentScore());

        
    }
}
