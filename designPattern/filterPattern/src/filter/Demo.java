package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

//        System.out.println(Objects.equals(persons.get(0), persons.get(1)));


        //使用stream流进行过滤(基于jdk1.8)
        //1.过滤出单身并且性别是男性的
        List<Person> single = persons.stream()
                .filter(person -> person.getMaritalStatus().equals("Single") && person.getGender().equals("Male"))
                .collect(Collectors.toList());
        System.out.println(single);
        //2.过滤出已婚
        List<Person> married = persons.stream()
                .filter(person -> person.getMaritalStatus().equals("Married"))
                .collect(Collectors.toList());
        System.out.println(married);
        //3.过滤出单身或者是男性的
        List<Person> singleOrMale = persons.stream()
                .filter(person -> person.getMaritalStatus().equals("Single") || person.getGender().equals("Male"))
                .collect(Collectors.toList());
        System.out.println(singleOrMale);


    }
}
