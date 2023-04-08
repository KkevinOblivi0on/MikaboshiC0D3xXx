public class Vehiculo {
    int weight, height;
    double speed;

    public Vehiculo() {
        weight = 50;
        height = 4;
        speed = 2; //miles per hour
    }

    public Vehiculo(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    public double getTime(double miles) { //gets the number of hours to go these miles
        return miles / speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }
}
