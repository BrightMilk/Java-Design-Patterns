package SimUDuck;

public class RedHeadDuck extends Duck {
    
    @Override
    public void display() {
        System.out.println("Quack-Quack there! I'm a " + this.getClass().getSimpleName() + ". " + this.getClass().getSuperclass().getSimpleName() + " is my parent.");
    }
}
