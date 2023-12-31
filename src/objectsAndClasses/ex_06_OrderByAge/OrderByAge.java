package objectsAndClasses.ex_06_OrderByAge;

public class OrderByAge {

    private String name;
    private String ID;
    private int age;

    public OrderByAge (String name, String ID, int age) {

        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.ID;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
    }



}
