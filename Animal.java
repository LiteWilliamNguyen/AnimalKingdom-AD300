abstract class Animal {
    //properties
    String name;
    int age;

    //Constructor to initialize name and age
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Method for eat, and sleep
    public void eat(){
        System.out.println(name + " is eating.");
    };
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    //Abstract method that will be overridden in subclasses to make a specific sound
    public abstract void makeSound();

    //method to display animal details
    public void displayInfo(){
        System.out.println("Animal name is " + name);
        System.out.println("Animal age is " + age);
    }
}
