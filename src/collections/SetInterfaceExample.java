package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        //Hashset
        HashSet<String> names = new HashSet<>();

        //Adding elements
        names.add("Bob");
        names.add("Anna");
        names.add("Anna");
        names.add("Liam");

        //Print all elements
        System.out.println(names); //Order is not the same as input

        //Remove elements
        names.remove("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains
        System.out.println(names.contains("Anna"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for (String str : names){
            System.out.println(str);
        }

        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //HashSet example 2

        HashSet<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2: " + intSet2);

        //Find union
        HashSet<Integer> union = new HashSet<>(intSet1);//Take all elements from one set and past to another
        System.out.println("Union: " + union);
        union.addAll(intSet2);
        System.out.println("Union: " + union);

        //Find intersection (find duplicates)
        HashSet<Integer> interSection = new HashSet<>(intSet1);
        interSection.retainAll(intSet2);
        System.out.println("Intersection: " + interSection);

        //Find difference
        HashSet<Integer> difference = new HashSet<>(intSet1);//Norādītajā setā izdzēš elementus, kas vienādi ar otru setu
        difference.removeAll(intSet2);
        System.out.println("difference: " + difference);

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Sweden");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Lithuania");
        System.out.println(linkedHashSet);
    }
}
