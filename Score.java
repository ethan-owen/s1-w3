public class Score {
    private int points;

    public Score(){
        points = 50;
    }

    public Score(int pts){
        points = pts;
    }

    public void increase(int amt){
        points += amt;
    }

    public void decrease(int amt){
        points -= amt;
    }

    public int currentScore(){
        return this.points;
    }

}
