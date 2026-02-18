package Date18_02_2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class namecomparator implements Comparator<student> {
    @Override
    public int compare(student s1, student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class student implements Comparable<student> {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(student s) {
        return this.id - s.id;
    }
}

public class lambda {

    public static void main(String[] args) {

        System.out.println();

        student s1 = new student(1, "abc");
        student s2 = new student(2, "lahf");
        student s3 = new student(3, "shfk");
        student s4 = new student(4, "hegufhs");

        List<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (student s : list) {
            System.out.println(s.id + ":" + s.name);
        }

        System.out.println();

        Collections.sort(list, new namecomparator());

        for (student s : list) {
            System.out.println(s.id + ":" + s.name);
        }

        System.out.println();

        Collections.sort(list, new Comparator<student>() {

            @Override
            public int compare(student s1, student s2) {
                return s1.name.compareTo(s2.name);
            }

        });

        for (student s : list) {
            System.out.println(s.id + ":" + s.name);
        }

        System.out.println();

        System.out.println("using lambda expression:");

        list.sort((a, b) -> {
            return a.name.compareTo(b.name);
        });

        for (student s : list) {
            System.out.println(s.id + ":" + s.name);
        }

        System.out.println();

    }
}
