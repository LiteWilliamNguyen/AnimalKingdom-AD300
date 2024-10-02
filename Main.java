import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        //create instance of each subclass
        Dog dog = new Dog("Buddy", 4);
        Cat cat = new Cat("Happy", 5);
        Bird bird = new Bird("Tweety", 1);

        //Store animal in ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        //loop through array
        //Call the methods eat(), sleep(), and the specific methods you created on each instance.
        for (Animal animal: animals) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            animal.makeSound();



        }
    }
}
