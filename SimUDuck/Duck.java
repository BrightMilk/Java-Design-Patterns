package SimUDuck;

/**
 * Define Duck abstract superclass.
 * All ducks can quack and swim; superclass provides generic implementation code.
 */
abstract public class Duck {

    public void swim() {
        System.out.println("I can swim");
    }
    
    /**
     * The display() method is declared abstract 
     * because all subtypes are displayed differently.
     * 
     * The subtype of each particular kind implements its specific version of display().
     */
    abstract public void display();
}
