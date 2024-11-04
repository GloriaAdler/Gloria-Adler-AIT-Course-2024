package homework.petsFromLesson18.dau;

import homework.petsFromLesson18.model.Pets;

public class PetHotelImpl implements EarningsCalculator {

    private Pets[] pets; // массив для хранения животных
    private int count; // количество добавленных животных
    private int days; // количество дней проживания животных

    //дорабатываем конструктор
    public PetHotelImpl(int capacity, int days) {
        this.pets = new Pets[capacity];
        this.count = 0;
        this.days = days;
    }

    // Метод для добавления животного в отель
    public void addPet(Pets pet) {
        if (count < pets.length) {
            pets[count] = pet; // добавляем питомца в массив
            count++;
        } else {
            System.out.println("Отель заполнен.");
        }
    }

    // Поиск питомца по ID
    public Pets findPetById(int id) {
        for (int i = 0; i < count; i++) {
            if (pets[i].getId() == id) {
                return pets[i];
            }
        }
        return null; // если не найден
    }

    // Поиск всех питомцев по типу (Cat или Dog)
    public Pets[] findPetsByType(String type) {
        Pets[] result = new Pets[count];
        int resultCount = 0;

        for (int i = 0; i < count; i++) {
            if (pets[i].getType().equalsIgnoreCase(type)) {
                result[resultCount] = pets[i];
                resultCount++;
            }
        }
        Pets[] filteredResult = new Pets[resultCount]; // создаем массив нужного размера
        System.arraycopy(result, 0, filteredResult, 0, resultCount);
        return filteredResult;
    }

    //метод для расчета общей выручки от содержания всех животных
    @Override
    public double calculateTotalEarnings() {//Метод calculateTotalEarnings суммирует стоимость содержания всех животных, умножая их ежедневную стоимость на количество дней проживания.
        double totalEarnings = 0;
        for (int i = 0; i < count; i++) {
            totalEarnings += pets[i].getDailyCost() * days;
        }
        return totalEarnings;
    }
}
