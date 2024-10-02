package homework_1_10.equation;
//Создать клас EquationAppl в пакете equation с методом main.
//В методе main создать несколько экземпляров QuadraticEquation и вывести для каждого из них результаты работы методов display,
    //delta, quantityRoots.
import homework_1_10.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {

        QuadraticEquation a = new QuadraticEquation(2, 3, 4);
        QuadraticEquation b = new QuadraticEquation(5, 9, 7);
        QuadraticEquation c = new QuadraticEquation( -1, 5, 3);

        //печатаем результат
        a.display();
        b.display();
        c.display();
    }
}
