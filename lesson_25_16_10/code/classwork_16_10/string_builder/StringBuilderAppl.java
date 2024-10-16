package classwork_16_10.string_builder;

public class StringBuilderAppl {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder ("Java");
        System.out.println(sb);

        sb.append("_").append("21");//append - добавить, присоединить. Через точку можно продолжать до бесконечности (но только в конец имеющейся строчки
        System.out.println(sb);

        sb.reverse();//разворот
        System.out.println(sb);

        StringBuilder sbNew = new StringBuilder("Hello");
        sbNew.insert(5, "!");//offset - место-индекс элемента, куда нужно вставить str
        System.out.println(sbNew);
        sbNew.append(true);
        System.out.println(sbNew);
    }
}
