package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesLit = true;
    public int candleCount = 2;
    public boolean frosting = true;
    public boolean candles = true;

    public void candlesBlow() {
        candlesLit = false;
    }

    public void candlesToggle() {
        candles = !candles;
    }

    public void frostingToggle() {
        frosting = !frosting;
    }

    public void candleCount(int progress) {
        candleCount = progress;
    }

}
