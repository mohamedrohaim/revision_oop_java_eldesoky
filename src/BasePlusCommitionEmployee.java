public class BasePlusCommitionEmployee extends  Commission_Employee{
    private double base;

    public BasePlusCommitionEmployee(String name, String address, int ssn, Gender sex, double gross_sales, double commission_rate) {
        super(name, address, ssn, sex, gross_sales, commission_rate);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    @Override
    public double earning(){
        return base+super.earning();

    }
    @Override
    public void DisplayDetails(){
       super.DisplayDetails();
       super.DisplayEarning();
    }
    @Override
    public void DisplayEarning(){
        System.out.println("earning = "+earning());
    }
}
