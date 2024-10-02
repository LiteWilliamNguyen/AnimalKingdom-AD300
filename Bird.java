//Bird subclass extends Animal
class Bird extends Animal{

    //constructor
    public Bird(String name, int age){
        super(name,age); //referring to the constructor of the Animal superclass
    }

    //Override to makeSound() method
    @Override
    public void makeSound(){
        System.out.println(name + " is chirping.");
    }
    //action for cat
    public void bite(){
        System.out.println(name + " is flying.");
    }
    //Overriding displayInfo method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(name + "Can peck as well.");
    }
}