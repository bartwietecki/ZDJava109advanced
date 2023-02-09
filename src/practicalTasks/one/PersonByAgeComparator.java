package practicalTasks.one;

import java.util.Comparator;

/**
 * Zewnętrzny, dodatkowy komparator implementuje interfejs Comparator
 * w odróżnieniu od domyślnego komparatora nakładanego na klasę
 * gdzie korzystamy z interfejsu Comparable
 */
public class PersonByAgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
