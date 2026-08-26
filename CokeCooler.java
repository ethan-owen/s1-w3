public class CokeCooler {
    private int numCoke;

    public CokeCooler(int amt){
        numCoke = amt;
    }

    public CokeCooler(){
        numCoke = 100;
    }

    public void drink(int amt){
        numCoke = numCoke - amt;
    }

    public void refill(int amt){
        numCoke = numCoke + amt;
    }

    public int cokeCount(){
        return numCoke;
    }
}
