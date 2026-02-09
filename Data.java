public class Data {
    private double sum;
    private int count;
    private double max;

    public Data() {
        sum = 0;
        count = 0;
        max = Double.NEGATIVE_INFINITY;
    }

    public void add(double value) {
        sum += value;
        count++;
        if (value > max) {
            max = value;
        }
    }

    public double average() {
        if (count == 0) return 0;
        return sum / count;
    }

    public double maximum() {
        if (count == 0) return 0;
        return max;
    }
}
