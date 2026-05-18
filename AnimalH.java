class Animal {
    public void eat(){
        System.out.println("animal is eating");
    }
    public void breath(){
        System.out.println("animal is breathing");
    }
    public void sleep(){
        System.out.println("animal is sleeping");
    }
}

class Deer extends Animal{
    public void eat(){
        System.out.println("eating grass");
    }
    public void foodHabit(){
        System.out.println("Herbivorous");
    }
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("Hunts and eat");
    }
    public void foodHabit(){
        System.out.println("Carnivorous");
    }
}

class Monkey extends Animal{
    public void eat(){
        System.out.println("Steals and eat");
    }
    public void foodHabit(){
        System.out.println("Omnivorous");
    }
}

public class AnimalH{
    public static void main(String[] args) {
        Deer d = new Deer();
        Tiger t = new Tiger();
        Monkey m = new Monkey();
        d.eat();
        d.sleep();
        d.foodHabit();
        t.eat();
        t.sleep();
        t.foodHabit();
        m.eat();
        m.sleep();
        m.foodHabit();
    }
}



