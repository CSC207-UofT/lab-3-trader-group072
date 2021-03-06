/* A sample class that implements the given interfaces.
 */
public class Dog implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Dog() {
        this.maxSpeed = 1;
    }
    
    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
