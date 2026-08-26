public class CandyJar {
    private int numCandies;

    public CandyJar(){
        numCandies = 10;
    }

    public CandyJar(int amt){
        numCandies = amt;
    }

    public void eatCandy(int amt){
        numCandies -= amt;
    }

    public void refillCandy(int amt){
        numCandies += amt;
    }
    
    public void printState(){
        System.out.println("Candy Amount: " + numCandies);
    }
}