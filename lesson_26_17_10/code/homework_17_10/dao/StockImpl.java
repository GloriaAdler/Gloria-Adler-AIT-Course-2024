package homework_17_10.dao;

import classwork_17_10.ait.employee.model.Employee;
import homework_17_10.model.Detail;

public class StockImpl implements Stock {

    private Detail [] details;//массив деталей
    private int size;// реальное кол-во деталей

    public StockImpl(int capacity) {//максимальная вместимость
        this.details = new Detail[capacity];
        this.size = size;
    }

    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail findDetail(long barCode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        return null;
    }

    @Override
    public Detail removeDetail(long barCode) {
        return null;
    }

    @Override
    public double totalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < size; i++) {
            totalWeight += details[i].getWeight();
        }
        return totalWeight;
    }

    @Override
    public double averageWeight() {
        if (size == 0){
            return 0;
        }
        return totalWeight()/size;
    }


}
