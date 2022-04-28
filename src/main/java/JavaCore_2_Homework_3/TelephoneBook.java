package JavaCore_2_Homework_3;

import java.util.HashMap;

/**
 * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
 * телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class TelephoneBook {

    private String name;
    private String telephone;

    static HashMap<String, String> book = new HashMap<>();

    public TelephoneBook(String name, String telephone) {
        super();
        this.name = name;
        this.telephone = telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public static void add(String name, String telephone) {
       book.put(name, telephone);
    }

    public static void get(String name) {
        for (int i = 0; i < book.size(); i++) {
          //  book.get(name);
        }
        System.out.println("Телефон данного лица: " + book.get(name));
    }

    @Override
    public String toString() {
        return "TelephoneBook{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
