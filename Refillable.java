public class Refillable {
    private int amount;

    public Refillable(){
        amount = 10;
    }

    public Refillable(int amt){
        amount = amt;
    }

    public void addTo(int amt){
        amount += amt;
    }

    public void useUp(int amt){
        amount -= amt;
    }

    public int currentAmt(){
        return this.amount;
    }
}
