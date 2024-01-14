public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}