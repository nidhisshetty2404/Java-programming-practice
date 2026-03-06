package advancedjava;

public class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class FinalClassDemo {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
