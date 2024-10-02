package classwork_1_10.employee;

import classwork_1_10.employee.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "N1", "LN1", 3000, true);
        Employee e2 = new Employee(2, "N2", "LN2", 4000, true);
        Employee e3 = new Employee(3, "N3", "LN3", 2000, false);
        Employee e4 = new Employee(4, "N4", "LN4", 4500, false);
        Employee e5 = new Employee(5, "N5", "LN5", 5000, true);

        //double totalSelary = e1.getSelary() + e2.getSelary() + e3.getSelary() + e4.getSelary() + e5.getSelary();

        System.out.println(e1.displayEmployee());
        System.out.println(e2.displayEmployee());
        System.out.println(e3.displayEmployee());
        System.out.println(e4.displayEmployee());
        System.out.println(e5.displayEmployee());

        //System.out.println("Total salary = " + totalSelary);
// тоже самое, только через массив.
//        Employee[] employees = new  Employee[5];
//        employees[0] = e1;
//        employees[1] = e2;
//        employees[2] = e3;
//        employees[3] = e4;
//        employees[4] = e5;

//        totalSelary = 0;
//        for (int i = 0; i < employees.length; i++) {
//            totalSelary+=employees[i].getSelary();
//        }
//        System.out.println(totalSelary);
//добавляем комк-то зп
//        Employee e5 = getSelary(6000);
//        System.out.println(e5.displayEmployee());


    }





}
