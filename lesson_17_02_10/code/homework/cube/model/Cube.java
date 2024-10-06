package homework.cube.model;
//Задача 2. Создать класс Cube, описывающий куб cо стороной a.
//Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
//Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
//Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {
    private double sideA;//создадим поле для стороны А

    public Cube(double sideA) {//конструктор для инициализации стороны А
        this.sideA = sideA;
    }

    public double calculatePerimeter (){//метод для поиска периметра - это сумма 12 рёбер куба, т.е. 12*на заданную длину одного ребра
        return 12*sideA;
    }

    public double calculateArea(){//метод для поиска площади, для этого 6 граней куба умнажаем на площад одной грани (для этого перемножаем 2 ребра)
        return 6*sideA*sideA;
    }

    public double calculateVolume(){//метод для поиска объема. Ребро в третьей степени.
        return sideA*sideA*sideA;
    }

    public void display(){//метод для вывода на экран
        System.out.println("A cube with a side " + sideA + " has: ");
        System.out.println("perimeter " + calculatePerimeter() + ".");
        System.out.println("sum of the areas of all faces: " + calculateArea() + ".");
        System.out.println("volume: " + calculateVolume() + ".");
        System.out.println();
    }
}
