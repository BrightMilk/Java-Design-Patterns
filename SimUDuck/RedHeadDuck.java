package SimUDuck;

import SimUDuck.Interfaces.Flyable;
import SimUDuck.Interfaces.Quackable;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    
    @Override
    public void fly() {
        System.out.println("I'm flying");
        
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        
    }

    @Override
    public void display() {
        System.out.println("Quack-Quack there! I'm a " + this.getClass().getSimpleName() + ". " + this.getClass().getSuperclass().getSimpleName() + " is my parent.");
    }
}
