
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {   //rewritting method which in parent class without changing parameters,returntype and only changing the body as for the requirement
        System.out.println("Dog barks");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
