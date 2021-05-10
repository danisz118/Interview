import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> integers = new ArrayList<>();
        List<String> list = new LinkedList<>();


        String path = "C:\\Users\\media\\Desktop\\java-course" +
                "\\jdbc-hibernate\\jdbc-hibernate-materials" +
                "\\Hibernate\\003_Intro_Hibernate\\cv_test\\src\\test.txt";


        String path2 = "C:\\Users\\media\\Desktop\\java-course" +
                "\\jdbc-hibernate\\jdbc-hibernate-materials" +
                "\\Hibernate\\003_Intro_Hibernate\\cv_test\\src\\test2.txt";
        File file = new File(path);
        File file2 = new File(path2);
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file2);


        while (scanner2.hasNextLine()) {
            list.add(scanner2.nextLine());
        }
        scanner2.close();

        while (scanner.hasNextInt()) {
            integers.add(scanner.nextInt());
        }
        scanner.close();
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (Integer integer : integers) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("Collection max " + Collections.max(integers));
        System.out.println("Collection min " + Collections.min(integers));



        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

//        for (String s : list) {
//            System.out.println(s);
//
//        }


        String joined  = list.stream().map(String::toString).collect(Collectors.joining(", "));
        System.out.println(joined);

        System.out.println(joined.trim());






    }
}

