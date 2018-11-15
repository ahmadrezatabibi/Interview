package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * Given a list of people with each person’s birth year and death year, find the year with the highest population
 * @author Reza
 */

public class MostPopulation {
    
    static final int STARTYEAR = 1890;
    static final int STOPYEAR = 2000;
    
    public static void main(String args[]) {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person(1910, 1940));
        personList.add(new Person(1920, 1935));
        personList.add(new Person(1900, 1950));
        personList.add(new Person(1890, 1920));
        personList.add(new Person(1890, 2000));
        personList.add(new Person(1945, 2000));
        
        findMaxPopulation(personList);
    }
    
    public static void findMaxPopulation(List<Person> personList) {
        Map<Integer, Integer> mapPersoaneCareAuTrait = new LinkedHashMap<>();

        for (int x = STARTYEAR; x <= STOPYEAR; x++) {
            mapPersoaneCareAuTrait.put(x, 0);
        }

        for (int x = STARTYEAR; x <= STOPYEAR; x++) {
            for (Person per : personList) {

                int value = mapPersoaneCareAuTrait.get(x);

                if (per.getBorn() == x) {
                    mapPersoaneCareAuTrait.put(x, value + 1);
                    continue;
                }

                if (per.getDie() == x) {
                    mapPersoaneCareAuTrait.put(x, value + 1);
                    continue;
                }

                if ((per.getDie() - per.getBorn() > per.getDie() - x) && (per.getDie() - x > 0)) {
                    mapPersoaneCareAuTrait.put(x, value + 1);
                    continue;
                }
            }
        }
        
        int maxKey = Collections.max(mapPersoaneCareAuTrait.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();        
        System.out.println("most lived year is: " + maxKey + " population: " + mapPersoaneCareAuTrait.get(maxKey));
    }

    static class Person {
        final private int born;
        final private int die;

        public Person(int pBorn, int pDie) {
            die = pDie;
            born = pBorn;
        }

        public int getBorn() {
            return born;
        }

        public int getDie() {
            return die;
        }
    }
}
