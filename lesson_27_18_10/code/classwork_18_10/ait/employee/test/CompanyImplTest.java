package classwork_18_10.ait.employee.test;

import classwork_18_10.ait.employee.dao.Company;
import classwork_18_10.ait.employee.dao.CompanyImpl;
import classwork_18_10.ait.employee.model.Employee;
import classwork_18_10.ait.employee.model.Manager;
import classwork_18_10.ait.employee.model.SalesManager;
import classwork_18_10.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;//после импорта assertEquals, можно его поменять на *, тогда доступны будут все assert

class CompanyImplTest {

    Company company;
    Employee[]emp;

    @BeforeEach
    void setUp() {
        //create object
        company = new CompanyImpl(5);
        //fill array to fill object company
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);//з/п - 9000
        emp[1] = new SalesManager(2, "N2", "L2", 165, 50000, 0.1);// з/п - 5000
        emp[2] = new SalesManager(3, "N3", "L3", 160, 80000, 0.15);// з/п - 12000
        emp[3] = new Worker(4, "N4", "L4", 170, 20);// з/п - 3400

        //TODO поместить объекты emp[] массива в объект company с помощью метода addEmployee
        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }
    }

    @Test
    void addEmployeeTest() {
        //check size
        assertEquals(4, company.quantity());//Equals - сравнение, 4 - ожидаемое, company.quantity() - реальное
        //can't add null
        assertFalse(company.addEmployee(null));
        //can't add dublicate
        assertFalse(company.addEmployee(emp[1]));
        //can add new employee
        Employee newEmp = new Worker(5, "N5", "L5", 140, 20);
        assertTrue(company.addEmployee(newEmp));
        //check size-снова проверяем размер, после добавления нового сотрудника
        assertEquals(5, company.quantity());
        //can't add one more employee
        Employee oneMoreEmp = new Worker(6, "N6", "L6", 140, 20);
        assertFalse(company.addEmployee(oneMoreEmp));
    }

    @Test
    void removeEmployeeTest() {
        //can remove existed
        assertEquals(emp [1], company.removeEmployee(2));
        //check size
        assertEquals(3,company.quantity());//проверили, что осталось только 3 сотрудника после удаления
        //can't remove absent
        assertNull(company.removeEmployee(7));
    }


    @Test
    void findEmployeeTest() {
        //find existed - поиск существующего
        assertEquals(emp[2], company.findEmployee(3));//id3 - это emp[2], т.е. мы ожидаем увидить по 3 id сотрудника на индексе 2
        //find absent - поиск не существующего (assertNull)
        assertNull(company.findEmployee(7));//id7 еще не существует, поэтому тест должен пройти
    }
//!!!!!
    @Test
    void updateEmplyeeTest() {
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest() {//методы типа void (речь идет о методе в классе CompanyImpl - public void printEmployee(), а не о том что все тестируемые методы void) НЕ проверяются с помощью assert.!!!
        company.printEmployee();
    }

    @Test
    void totalSalaryTest() {
        double totalSalary = 29400;
        assertEquals(totalSalary, company.totalSalary());
    }

    @Test
    void averageSalaryTest() {
        double averageSalary = 7350;
        assertEquals(averageSalary, company.averageSalary());
    }

    @Test
    void totalSalesTest (){
        assertEquals(130000, company.totalSales());
    }

    @Test
    void findEmployeeHoursGreateThanTest() {
        // Ищем сотрудников, которые отработали больше 160 часов, при 40 часовой недели
        Employee[] overworkedEmployees = company.findEmployeeHoursGreateThan(160);
        // Проверяем, что нашли двух сотрудников
        assertEquals(2, overworkedEmployees.length);
        // Проверяем, что это сотрудники N2 - 165 часов и N4 - 170 часов
        assertEquals(2, emp[1].getId());
        assertEquals(4, emp[3].getId());
    }

    @Test
    void findEmployeeSalaryRangeTest() {
        // Ищем сотрудников с зарплатой от 3401 до 11999
        Employee[] employeesInRange = company.findEmployeeSalaryRange(3401, 11999);
        // Проверяем, что нашли двух сотрудников
        assertEquals(2, employeesInRange.length);//employeesInRange.length
        // Проверяем, что это сотрудники N1 и N2
       assertEquals(1, emp[0].getId());
       assertEquals(2, emp[1].getId());
    }
}