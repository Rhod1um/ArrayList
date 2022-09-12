import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] names = {"Ron","Harry","Hermione"};
        ArrayList<String> people = new ArrayList<>(List.of(names)); //List.of() indsætter array i arraylist

        System.out.println(people);

        people.add("Draco");
        System.out.println(people);

        people.add("Neville");
        System.out.println(people);

        people.add("Luna");
        System.out.println(people);

        List<String> youThree = people.subList(0,3);
        System.out.println(youThree);

        people.add(1,"cho"); //rykker det hele, så harry kommer på 2 frem for 1. Add tilføjer kun
        //den erstatter ikke. set erstatter
        System.out.println(people);

        people.set(1,"ginny"); //set erstatter cho med ginny
        System.out.println(people);

        people.addAll(List.of(new String[]{"Fred","George"})); //tilføjer et array til arraylisten
        System.out.println(people);

        //List.of() bruges når et array skal indsættes i ArrayList

        int result = people.indexOf("Fred"); //returnere int for indexet
        System.out.println(result);

        people.remove(result); //fjerner objektet på det index man sætter ind, her 7, "Fred"
        System.out.println(people);
    }
}
