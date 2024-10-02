//Cat subclass extends Animal
class Cat extends Animal{

    //constructor
    public Cat(String name, int age){
        super(name,age); //referring to the constructor of the Animal superclass
    }

    //Override to makeSound() method
    @Override
    public void makeSound(){
        System.out.println(name + " is purring.");
    }
    //action for cat
    public void bite(){
        System.out.println(name + " is biting that man over there.");
    }

    //Overriding displayInfo method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(name + "Can scratch as well.");
    }
}