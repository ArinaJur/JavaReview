package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassArrayList {
    public static void main(String[] args) {
        //List list = new ArrayList();

        List<String> list1 = new ArrayList<>();
        Collection<String> collection1 = list1;
        java.lang.Iterable<String> iterable1 = collection1;

        list1.add("This is List1");
        collection1.add("This is collection1");

        System.out.println("list1: " + list1);
        System.out.println("collection1: " + collection1);
        System.out.println("iterable1: " + iterable1);

        System.out.println("______________________________________________");

        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("listOne");
        list.add("listTwo");

        collection1.add("collection");
        collection.add("collectionOne");

        System.out.println("list: " + list);
        System.out.println("collection: " + collection);

        collection = list;
        System.out.println("collection = list: " + collection);
    }
}
