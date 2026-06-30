package exercise3;

public class Main {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGpu("RTX 4090")
                .build();

        gamingPC.display();
    }
}
