class SalariesEmployee extends Employee implements  Displayaple{

   private double salary,bonus,deduction;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public SalariesEmployee() {

    }

    public SalariesEmployee(String name, String address, int ssn, Gender sex, double salary, double bonus, double deducation) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deducation;
    }

    @Override
    public double earning(){
        return (salary+bonus)-deduction;
    }

    @Override
    public void DisplayDetails(){
        System.out.println(super.toString());
        System.out.println(toString());

    }
    @Override
    public void DisplayEarning(){
        System.out.println(earning());

    }
    @Override
    public String toString() {
        return "SalariesEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deduction=" + deduction +
                '}';
    }
}
