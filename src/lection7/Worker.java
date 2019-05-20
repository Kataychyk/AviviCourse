package lection7;

interface Sallary {
    public int sallary();
}

public class Worker implements Sallary {
    int hours = 40;
    int price = 50;

    public int sallary() {
        return hours * price;
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.print(worker.sallary());
    }
}
