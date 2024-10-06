package homework.cube;

import homework.cube.model.Cube;

//Задача 2. Создать класс Cube, описывающий куб cо стороной a.
//Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
//Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
//Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class CubeAppl {
    public static void main(String[] args) {
        Cube first = new Cube(5);
        first.display();

        Cube second = new Cube(1.5);
        second.display();

        Cube third = new Cube(1);
        third.display();

        Cube fourth = new Cube(3.7);
        fourth.display();

        Cube fifth = new Cube(0.5);
        fifth.display();

    }
}
