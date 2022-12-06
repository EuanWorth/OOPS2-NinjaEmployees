public class Employee {
    private String name;
    public void work() {
        System.out.println("I am doing work!");
    }
    public void greet() {
        System.out.println("Hi I am an Employee called " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(String aName) {
        this.name = aName;
    }
}
