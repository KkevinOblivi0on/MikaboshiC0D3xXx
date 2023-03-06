public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        //create a constructor that will initialize the name and age variables
        this.name = name;
        this.age = age;
    }

    //create a method called getName () that will return the person's name
    public String getName() {
        return name;
    }

    //create a method called getAge() that will return the person's age
    public int getAge() {
        return age;
    }

    //create a method called setAge() that will set the person's age
    public void setAge(int age) {
        this.age = age;
    }
}