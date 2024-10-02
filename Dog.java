//Dog subclass extends Animal
class Dog extends Animal{

    //constructor
    public Dog(String name, int age){
        super(name,age); //referring to the constructor of the Animal superclass
    }

    //Override to makeSound() method
    @Override
    public void makeSound(){
        System.out.println(name + " is barking.");
    }
    //action for dog
    public void dogWalk(){
        System.out.println(name + " is out for a walk.");
    }
    //Overriding displayInfo method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(name + "Can bite as well.");
    }
}