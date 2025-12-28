package Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Arraylist {

    public static void main(String[] args) {


        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("------------");
        System.out.println("Insert Data ");
        System.out.println("------------");

        for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }

        System.out.println("ArrayList Values: " + numberList);

        System.out.println("------------");
        System.out.println("Get Values ");
        System.out.println("------------");
        System.out.println("First Element: " + numberList.get(0));

        System.out.println("------------");
        System.out.println("ArrayList Operations using Methods");
        System.out.println("------------");

        System.out.println("Sum: " + calculateSum(numberList));
        System.out.println("Max: " + findMax(numberList));
        System.out.println("Min: " + findMin(numberList));
        System.out.println("Average: " + calculateAverage(numberList));



        System.out.println("\n------------");
        System.out.println("Insert Data (HashSet)");
        System.out.println("------------");

        HashSet<String> countrySet = new HashSet<>();

        countrySet.add("USA");
        countrySet.add("Canada");
        countrySet.add("France");
        countrySet.add("Japan");
        countrySet.add("Australia");

        System.out.println("HashSet Values: " + countrySet);

        System.out.println("\n-------------");
        System.out.println("Enhanced Loop (HashSet)");
        System.out.println("-------------");

        for (String country : countrySet) {
            System.out.println(country);
        }


        System.out.println("\n------------");
        System.out.println("Insert Data (HashMap)");
        System.out.println("------------");

        HashMap<Integer, Double> employeeData = new HashMap<>();

        employeeData.put(101, 45000.90);
        employeeData.put(102, 50000.10);
        employeeData.put(103, 55000.50);
        employeeData.put(104, 60000.80);
        employeeData.put(105, 70000.23);

        System.out.println("HashMap Values: " + employeeData);

        System.out.println("\n-------------");
        System.out.println("Enhanced Loop (HashMap)");
        System.out.println("-------------");

        for (Integer id : employeeData.keySet()) {
            System.out.println("Employee ID: " + id + "  Salary: " + employeeData.get(id));
        }

        System.out.println("\nAverage Salary: " + averageSalary(employeeData));

        System.out.println("\n--------------");
        System.out.println("Sizes of Collections");
        System.out.println("--------------");

        System.out.println("ArrayList Size: " + numberList.size());
        System.out.println("HashSet Size: " + countrySet.size());
        System.out.println("HashMap Size: " + employeeData.size());
    }



    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) sum += num;
        return sum;
    }

    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer num : list) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer num : list) {
            if (num < min) min = num;
        }
        return min;
    }

    public static double calculateAverage(ArrayList<Integer> list) {
        return (double) calculateSum(list) / list.size();
    }



    public static double averageSalary(HashMap<Integer, Double> map) {
        double total = 0;
        for (Double s : map.values()) {
            total += s;
        }
        return total / map.size();
    }
}
