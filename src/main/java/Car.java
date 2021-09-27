/* class for a Car that implements some interfaces
 */
public class Car implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Car() {
        this.maxSpeed = 500;
    }

    @Override
    public String sound() {
        return "Beep! Beep!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 36018;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}

