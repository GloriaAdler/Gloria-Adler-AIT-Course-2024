package homework.computer.dau;
import homework.computer.model.Computer;
import java.util.ArrayList;
import java.util.List;


public class ComputerImpl implements Shop{

    private List<Computer> computers = new ArrayList<>();

    @Override
    public boolean addComputer(Computer computer) {
        return computers.add(computer);
    }

    @Override
    public boolean removeComputer(Computer computer) {
        return computers.remove(computer);
    }

    @Override
    public Computer findComputerByBrand(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    @Override
    public List<Computer> getAllComputers() {
        return new ArrayList<>(computers);
    }

    @Override
    public int size() {
        return size();
    }
}
