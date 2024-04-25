package package7;

public class Farm {
    public static void main(String[] args){
        Animal duck = new Duck();
        duck.eat();

        Animal pig = new Pig();
        pig.makeSound();

        Duck donald = new Duck();
        donald.makeSound();
    }
}
