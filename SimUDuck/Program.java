package SimUDuck;

public class Program {
    public static void main(String[] args) {
        MallardDuck mDuck = new MallardDuck();
        RedHeadDuck rHduck = new RedHeadDuck();
        mDuck.display();
        mDuck.fly();    
        rHduck.display();
        rHduck.fly();  
    }
}
