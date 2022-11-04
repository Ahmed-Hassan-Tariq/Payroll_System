import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[50];


        employees[0] = new Employee("Amna Cheema","HOD", new DOB(21,05,2001), 1500);
        employees[1] = new Employee("Abdullah","Lecturer", new DOB(27,05,2002), 700);
        employees[2] = new Employee("Anna Khan","Attendant", new DOB(22,02,2003), 1200);
        employees[3] = new Employee("Ali","InCharge", new DOB(29,07,1992), 1200);

        Date d1 = new Date();

        for(int i=0;i<employees.length; i++){
            if(employees[i]!=null){
                employees[i].printEmployee();
                employees[i].checkDOB(05);

            }
        }
    }
}