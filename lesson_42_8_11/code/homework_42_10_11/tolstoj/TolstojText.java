package homework_42_10_11.tolstoj;
import java.util.HashMap;
import java.util.Map;
//Задание 2. Подсчитайте частоту использования слов в предложении Л.Н.Толстого: "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы."
//
// Удаление знаков препинания и приведение к нижнему регистру text = text.replaceAll("[^a-zA-Z0-9\s]", "").toLowerCase();
public class TolstojText {
    public static void main(String[] args) {

        String text = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";


        // удаляем знаки препинания и приводим текст к нижнему регистру
        text = text.replaceAll("[^a-zA-Zа-яА-ЯёЁ0-9\s]", "").toLowerCase();// удаляет все символы, кроме букв (как латиницы, так и кириллицы) и цифр, и приводит текст к нижнему регистру.

        // создаем карту для хранения частоты слов
        Map<String, Integer> wordFrequency = new HashMap<>();

        // преобразуем текст в массив слов
        String[] words = text.split("\\s+");//split("\\s+") - разделяет строку на слова, используя пробелы в качестве разделителя.

        // считаем частоту каждого слова
        for (String word : words) {
            if (!word.isEmpty()) { // проверяем, что слово не пустое
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);//wordFrequency.getOrDefault(word, 0) + 1 - получает текущее значение счётчика для слова или 0, если слово отсутствует, и увеличивает на 1.
            }
        }

        System.out.println("Частота использования слов в предложении:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {//Map.Entry содержит как ключ, так и значение, связанные друг с другом. Используется для итерации по Map: позволяет обойти каждую пару ключ-значение с помощью entrySet().
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
