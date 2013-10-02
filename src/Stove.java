
public class Stove {

    private stoveTemp currentTemperature;

    public void setStoveTemperature(stoveTemp t) {
        currentTemperature = t;
    }

    public stoveTemp getTemp() {
        return currentTemperature;
    }

    public Stove(stoveTemp o) {
	    currentTemperature = o;
    }
    

}
