import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        Developer dev1 = new Developer("John Doe",35000, 20, 500);
        staffs.add(dev1);
        Developer dev2 = new Developer("Marry Ann",35000, 10, 300);
        staffs.add(dev2);
        CEO ceo1 = new CEO("Elon Musk", 150000, 4, 20000);
        staffs.add(ceo1);
        Marketing marketing1 = new Marketing("Sara Wong",30000,2,500);
        staffs.add(marketing1);
        Driver dv1 = new Driver(20, 500);
        staffs.add(dv1);
        Cleanner cn1 = new Cleanner(4, 1000);
        staffs.add(cn1);
        Monthly_Payment mp1 = new Monthly_Payment(2500, 463, 8, 500);
        staffs.add(mp1);

        int totalPayment = 0;
        int totalSalary = 0;
        int tax = 0;
        for (IPayment staff : staffs) {
            System.out.println(staff.getName() + " = " + staff.getPayment());
            totalPayment += staff.getPayment();
            totalSalary += staff.getSalary();
        }
        System.out.println("Total Payment: " + totalPayment);
        System.out.println("---------------------------------------------------");
        System.out.println("Total Salary only Staff: " + totalSalary);
        System.out.println("Total Tax 3%: " + totalSalary * 3/100);
    }
}
