package homework.computer.test;

import homework.computer.dau.ComputerImpl;
import homework.computer.model.Computer;
import homework.computer.model.Laptop;
import homework.computer.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputerImplTest {

    private ComputerImpl computerImpl;
    private Computer laptop;
    private Computer smartphone;

    @BeforeEach
    void setUp() {
        computerImpl = new ComputerImpl();
        laptop = new Laptop("Intel i5", 8, 256, "HP", 700.00, 14.0, 1.8, 8, "Black");
        smartphone = new Smartphone("Apple A14", 4, 64, "Apple", 999.99, 5.5, 0.2, 12, "Gold", 987654321098765L);
        computerImpl.addComputer(laptop);
        computerImpl.addComputer(smartphone);
    }

    @Test
    void addComputerTest() {
        Computer newComputer = new Laptop("AMD Ryzen", 16, 512, "Lenovo", 1200.00, 15.6, 2.3, 10, "Blue");
        assertTrue(computerImpl.addComputer(newComputer));
        List<Computer> computers = computerImpl.getAllComputers();
        assertEquals(3, computers.size());
    }

    @Test
    void removeComputerTest() {
        assertTrue(computerImpl.removeComputer(laptop));
        List<Computer> computers = computerImpl.getAllComputers();
        assertEquals(1, computers.size());
    }

    @Test
    void findComputerByBrandTest() {
        Computer foundComputer = computerImpl.findComputerByBrand("Apple");
        assertEquals(smartphone, foundComputer);
    }

    @Test
    void getAllComputersTest() {
        List<Computer> computers = computerImpl.getAllComputers();
        assertEquals(2, computers.size());
        assertTrue(computers.contains(laptop));
        assertTrue(computers.contains(smartphone));
    }

    @Test
    void size() {
        assertEquals(4, computerImpl.size());
    }
}