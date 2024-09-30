package telsuko;

public class Human {

    private int age;
    private String name;

    public Human (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human() {
        this(0, "Unknown");  
    }

    public void show() {
        System.out.println("My Name is " + name + " and I am " + age + " years old!");
    }

    public void setAge(int updatedAge) {
        if (updatedAge >= 0) {
            age = updatedAge;
        } else {
            System.out.println("Age must be non-negative");
        }    
    }

    public final int getAge() {
        return age;
    }

    public void setName(String updatedName) {
        if (updatedName != null && !updatedName.trim().isEmpty()) {
            name = updatedName;
        } else {
            System.out.println("Name cannot be empty");
        }    
    }

    public final String getName() {
        return name;
    }
    
}
