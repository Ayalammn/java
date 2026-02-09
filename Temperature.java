public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        value = 0;
        scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        return (value - 32) * 5 / 9;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        return (value * 9 / 5) + 32;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void set(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
}
