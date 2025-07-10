package labs_examples.objects_classes_methods.labs.objects;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ComputerController {
    public static void main(String[] args) {
        Computer mini = new Computer("Liquid VDI", "Standard Video Card");
        Computer client = new Computer("Intel" + " standard base line terminal ");
        Computer server = new Computer("Intel", "48gb", "200tb", "GeForce RTX 3050");

        System.out.println(mini.getCPU() + " - " + mini.getVideoCard());
        System.out.println(client.getCPU());
        System.out.println(server);
    }
}
