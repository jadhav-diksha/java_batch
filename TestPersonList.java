import java.util.*;

class PersonInfo {

    int id;
    String name;
    int age;
    String city;

    PersonInfo(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

public class TestPersonList {

    public static void main(String args[]) {

        PersonInfo p1 = new PersonInfo(101, "Diksha", 22, "Pune");
        PersonInfo p2 = new PersonInfo(102, "Gauri", 23, "Daund");

        ArrayList<PersonInfo> l1 = new ArrayList<>();
        l1.add(p1);
        l1.add(p2);

        Iterator<PersonInfo> itr = l1.iterator();

        while (itr.hasNext()) {
            PersonInfo p = itr.next();
            System.out.println(p.id + " " + p.name + " " + p.age + " " + p.city);
        }
    }
}
