public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int takeDrink(){
        return volume -= 10;
    }

    public int emptyBottle(){
        return volume = 0;
    }

    public int fillBottle(){
        return volume;
    }
}
