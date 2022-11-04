public class Employee {

    private String name;
    private String designation;
    private DOB dob;

    private int payroll;


    public Employee(String name, String designation, DOB dob, int payroll) {
        this.name = name;
        this.designation = designation;
        this.dob = dob;
        this.payroll = payroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public DOB getDob() {
        return dob;
    }

    public void setDob(DOB dob) {
        this.dob = dob;
    }

    public int getPayroll() {
        return payroll;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    public void printEmployee(){
        System.out.println(
                "Name: "+name+" | "+
                "Designation: "+designation+" | "+
                "DOB: "+dob.printDOB()+" | "+
                "Payroll: "+payroll
        );
    }


    public void checkDOB(int currentMonth){
        if(dob.getMonth()==currentMonth){
            payroll += 100;
            System.out.println("Payroll Increased: "+ payroll);
        }
    }
}
