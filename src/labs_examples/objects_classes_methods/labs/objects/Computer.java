package labs_examples.objects_classes_methods.labs.objects;

public class Computer {
    private String CPU;
    private String RAM;
    private String drive;
    private String videoCard;

    public Computer(String CPU, String videoCard) {
        this.CPU = CPU;
        this.videoCard = videoCard;
    }

    public Computer(String CPU) {
        this.CPU = CPU;
    }

    public Computer(String CPU, String RAM, String drive, String videoCard) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.drive = drive;
        this.videoCard = videoCard;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Professional Client: " + CPU + " Chip Set - " + RAM + " ram - " + drive + " disk space - " + videoCard + '\'';
    }
}
