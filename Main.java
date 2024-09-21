class Animal {
    
    public Animal() {
        System.out.println("Create animal");
    }
    
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    protected void finalize() throws Throwable {
        System.out.println("Delete animal");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog");
    }

    @Override
    public void sound() {
        System.out.println("Dogs barks");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Cat");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.sound();   
        d.sound();
        c.sound();    
    }
}