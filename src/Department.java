import java.util.ArrayList;

public class Department {
    int dno;
    String dname;
    ArrayList<Employee>empList;

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        this.empList = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
 public void addEmployee(Employee employee) {
        empList.add(employee);
    }
    public void removeEmployee(int index) {
        empList.remove(index);
    }
    public int getEmployeeCount(){
        return empList.size();
    }
    public void print_base_data(){
        for (int i=0;i<empList.size();i++){
            System.out.println(empList.get(i).getSsn() +
                    " "+empList.get(i).getName()+" "+empList.get(i).getSex());
        }
    }

    public void get_all_details(){
        for (int i=0;i<empList.size();i++){
            if(empList.get(i) instanceof SalariesEmployee){
                //TODO: casting
                ((SalariesEmployee) empList.get(i)).DisplayDetails();
            }
           if(empList.get(i) instanceof HourlyEmployee){
                //TODO: casting
                ((HourlyEmployee) empList.get(i)).DisplayDetails();
            }
           if(empList.get(i) instanceof Commission_Employee){
                //TODO: casting
                ((Commission_Employee) empList.get(i)).DisplayDetails();
            }

        }
    }


}
