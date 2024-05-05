public class RangeInput {
    private int currentTemperature ,maxTemperature ,minTemperature;

    private void MyCurrentTemperature() {
        currentTemperature = (maxTemperature + minTemperature) / 2;
    }

    public RangeInput(){
        minTemperature = 80;
        maxTemperature = 60;
        MyCurrentTemperature();
    }

    public RangeInput(int max, int min) {
        maxTemperature = max;
        minTemperature = min;
        MyCurrentTemperature();
    }
    public void up(){
        currentTemperature = Math.min(currentTemperature + 1, maxTemperature);
    }
    public void down(){
        currentTemperature = Math.max(currentTemperature - 1, minTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
