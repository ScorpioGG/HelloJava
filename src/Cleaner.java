public class Cleaner implements IPayment{

    private int DayOfWork;
    private int rate;
    private String name = "Cleaner";

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return 0;
    }

    public Cleaner(int DayOfWork, int rate) {
        this.rate = rate;
        this.DayOfWork = DayOfWork;
    }

    @Override
    public int getPayment() {
        return this.DayOfWork * this.rate;
    }
}