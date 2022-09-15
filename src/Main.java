public class Main {
    public static void main(String[] args){
       Department d1=new Department(1,"Android developers");
       SalariesEmployee se=new SalariesEmployee("Mohamed","Egypt",
               20,Gender.male,10.000,
               0.07,50);
       d1.addEmployee(se);
       HourlyEmployee he=new HourlyEmployee("Women","sudan",15,Gender.female,2.5,3);
        d1.addEmployee(he);
        Commission_Employee ce=new Commission_Employee("Abdullah","Germany",16,Gender.male,5.0,12);
        d1.addEmployee(ce);
        System.out.println("total employees: "+d1.getEmployeeCount());
        d1.print_base_data();
        d1.get_all_details();
    }
}
