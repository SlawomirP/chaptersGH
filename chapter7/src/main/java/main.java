public class main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog dog2 = (Dog) dog;

        dog.sound();
        cat.sound();
        dog2.testMethod();


    }
}
