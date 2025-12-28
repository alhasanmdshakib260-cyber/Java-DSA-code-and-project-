package Data;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class DataStructureInjava {
    public static void main(String[] args) {
        Integer array[] = new Integer[3];
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, String> hasMap = new HashMap<>();

        System.out.println("------------");
        System.out.println("Insert Data");
        System.out.println("------------");

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(30);

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        hasMap.put(1, "one");
        hasMap.put(2, "two");
        hasMap.put(3, "three");
        hasMap.put(3, "three Dup");

        System.out.println("Array value: " + Arrays.toString(array));
        System.out.println("ArrayList value: " + arrayList);
        System.out.println("HashSet value: " + hashSet);
        System.out.println("HashMap value: " + hasMap);

        System.out.println("---------");
        System.out.println("Get/Access Values");
        System.out.println("---------");

        System.out.println("Array value: " + array[0]);
        System.out.println("ArrayList value: " + arrayList.get(0));
        System.out.println("HashSet contains 10: " + hashSet.contains(10));
        System.out.println("HashMap value (key 1): " + hasMap.get(1));

        System.out.println("-----------");
        System.out.println("Update Values");
        System.out.println("-----------");

        array[0] = 40;
        arrayList.set(1, 10);
        hashSet.add(10);
        hasMap.put(3, "Three Updated");

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashMap: " + hasMap);

        System.out.println("-----------");
        System.out.println("Delete Values");
        System.out.println("-----------");

        array[0] = null;
        arrayList.remove(0);
        hashSet.remove(10);
        hasMap.remove(1);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashMap: " + hasMap);

        System.out.println("-----------");
        System.out.println("Enhanced Looping");
        System.out.println("-----------");

        System.out.println("Array -->");
        for (
                Integer i : array) {
            System.out.println(i);
        }

        System.out.println("ArrayList -->");
        for (
                Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("HashSet -->");
        for (
                Integer i : hashSet) {
            System.out.println(i);
        }

        System.out.println("HashMap -->");
        for (
                Integer key : hasMap.keySet()) {
            System.out.println(key + " : " + hasMap.get(key));
        }

        System.out.println("--------------");
        System.out.println("Sizes");
        System.out.println("--------------");

        System.out.println("Array size --> " + array.length);
        System.out.println("ArrayList size --> " + arrayList.size());
        System.out.println("HashSet size --> " + hashSet.size());
        System.out.println("HashMap size --> " + hasMap.size());
    }
}



