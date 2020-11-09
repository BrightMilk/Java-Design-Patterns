package SimUDuck;

public class RubberDuck extends Duck {

    /**
     * Rubber ducks don't quack, so quack() is overridden.
     */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("This is " + this.getClass().getSimpleName());
    }
    
    /**
     * Rubber ducks don't fly, so fly() is overridden.
     */
    @Override
    public void fly() {
        // Nothing to do.
    }
}
