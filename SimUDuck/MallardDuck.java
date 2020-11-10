package SimUDuck;

import SimUDuck.Interfaces.Flyable;
import SimUDuck.Interfaces.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {
    
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
        System.out.println("Hey! I'm a " + this.getClass().getSimpleName() + ". My parent is " + this.getClass().getSuperclass().getSimpleName() + ".");
    }
}
