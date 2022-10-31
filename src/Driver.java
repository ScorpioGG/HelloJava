public class Driver implements IPayment{

    private int NoOfTrip;
    private int rate;
    private String name = "Driver";

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return 0;
    }

    public Driver(int NoOfTrip, int rate) {
        this.rate = rate;
        this.NoOfTrip = NoOfTrip;
    }

    @Override
    public int getPayment() {
        return this.NoOfTrip * this.rate;
    }
}