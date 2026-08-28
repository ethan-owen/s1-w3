public class Refillable {
    private int amount;
    private int totalUsed;
    private int totalTimeUsedHappens;

    public Refillable(){
        amount = 10;
    }

    public Refillable(int a){
        amount = a;
    }

    public void addTo(int a){
        amount += a;
    }

    public void useUp(int a){
        amount -= a;
        totalUsed += a;
        totalTimeUsedHappens += 1;
    }

    public int currentAmt(){
        return this.amount;
    }

    public double averageUse(){
        return this.totalUsed * 1.0/totalTimeUsedHappens;
    }
}
