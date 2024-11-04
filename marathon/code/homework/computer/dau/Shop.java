package homework.computer.dau;
import homework.computer.model.Computer;
import java.util.List;
public interface Shop {

    boolean addComputer(Computer computer);
    boolean removeComputer(Computer computer);
    Computer findComputerByBrand(String brand);
    List<Computer> getAllComputers();
    int size ();


}
