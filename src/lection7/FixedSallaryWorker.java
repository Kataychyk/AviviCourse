package lection7;

public class FixedSallaryWorker implements Sallary {
    int sallary = 5000;

    @Override
    public int sallary() {
        return sallary;
    }

    public static void main(String[] args) {
        FixedSallaryWorker worker = new FixedSallaryWorker();
        System.out.print(worker.sallary());
    }
}
