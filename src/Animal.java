class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Subclasa Lion
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}

// Subclasa Tiger
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger eats meat and occasionally vegetables.");
    }

    @Override
    public void sound() {
        System.out.println("The tiger growls.");
    }
}

// Subclasa Panther
class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("The panther is a carnivore and primarily eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The panther makes a distinctive vocalization.");
    }
}