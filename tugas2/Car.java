package tugas2;

public abstract class Car {
    private String merek;
    private String model;
    private String warna;
    private long noMesin;

    public Car(String merek, String model, String warna, long noMesin) {
        this.merek = merek;
        this.model = model;
        this.warna = warna;
        this.noMesin = noMesin;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public long getNoMesin() {
        return noMesin;
    }

    public void setNoMesin(long noMesin) {
        this.noMesin = noMesin;
    }

    public abstract void start();

    public abstract void stop();

    public void displayInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Warna : " + warna);
        System.out.println("No Mesin : " + noMesin);
    }
}

class SUV extends Car {
    private int offRoadCapability;

    public SUV(String merek, String model, String warna, long noMesin, int offRoadCapability) {
        super(merek, model, warna, noMesin);
        this.offRoadCapability = offRoadCapability;
    }

    @Override
    public void start() {
        System.out.println("SUV with off-road capability " + offRoadCapability + " has been started.");
    }

    @Override
    public void stop() {
        System.out.println("SUV has been stopped.");
    }
}
