public class Main {
    public static void main(String[] args) {
        Animal[] a = new Animal[10];

        for (int i = 0; i < 10; ++ i) {
            if (i % 2 == 0) {
                a[i] = new Cat();
            } 
            else {
                a[i] = new Dog();
            }
        }

        for (Animal animal : a) {
            animal.makeSound();
        }
    }
}
