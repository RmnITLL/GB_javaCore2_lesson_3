package JavaCore_2_Homework_3;

import java.util.LinkedList;


public class Telephone extends TelephoneBook {


    public Telephone(String name, String telephone) {
        super(name, telephone);
    }


    public static void main(String[] args) {

        Telephone.add("Иванов", "+78008008888");
        Telephone.add("Петров", "890100011020");
        Telephone.add("Сидоров", "89022211022");
        Telephone.add("Ивашкин", "89033311033");
        Telephone.add("Титов", "890444411044");
        Telephone.add("Романов", "8905555102555");
        Telephone.add("Рюрикивич", "890600011777");

        System.out.println(book);

        Telephone.get("Петров");


     }
}
