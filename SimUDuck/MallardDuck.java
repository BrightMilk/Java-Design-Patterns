package SimUDuck;

public class MallardDuck extends Duck {
    
    @Override
    public void display() {
        System.out.println("Hey! I'm a " + this.getClass().getSimpleName() + ". My parent is " + this.getClass().getSuperclass().getSimpleName() + ".");
    }
}
