public class month_pay implements IPayment {
    int rental;
    int electricity;
    int internet;

    public Monthly_Payment(int rentalRate, int unitOfUse, int rate, int itn) {
        rental = rentalRate;
        electricity = unitOfUse * rate;
        internet = itn;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    public int getRental() {
        return rental;
    }

    public void setRental(int rentalRate) {
        rental = rentalRate;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int unitOfUse, int rate) {
        electricity = unitOfUse * rate;
    }

    public int getInternet_Access() {
        return internet;
    }

    public void setInternet_Access(int itn) {
        internet = itn;
    }

    @Override
    public String getName() {
        return "month_Pay";
    }

    @Override
    public int getPayment() {
        return (this.rental) + (this.electricity) + (this.internet);
    }
}