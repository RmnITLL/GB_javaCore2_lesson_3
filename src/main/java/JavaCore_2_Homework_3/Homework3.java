package javaCore2_lesson_3;
/**
 * 1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
 * вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 */

import java.util.*;

public class Homework3 {
    public static <ListArray> void main(String[] args) {

        String[] array = new String[]{
                "Ехал", "Грека", "через", "реку",
                "Ехал", "Грека", "через", "реку",
                "Карл", "у", "Клары", "украл", "кларнет", "а"
        };

        List<String> str = new ArrayList<>(Arrays.asList(array));
        int count = 0;
        Map <String, Integer> duplicatCountMap = new HashMap<>();
        for (int j = 0; str.size() > j; j++) {
            for (int i = 0; i < str.size(); i++) {
                if (str.get(j).equals(str.get(i))) {
                    count++;
                    duplicatCountMap.put(str.get(j), count);
                }
            }
        }
        System.out.println(duplicatCountMap);
        Set <String> myValueSet = new HashSet<>();
        for (Map.Entry< String, Integer> entry: duplicatCountMap.entrySet()) {
            myValueSet.add(entry.getKey());
        }
        System.out.println(myValueSet);
    }
}

