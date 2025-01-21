package yaart.s469198.persons;


import yaart.s469198.interfaces.Repairable;
import yaart.s469198.world.*;

public record Father(String name, int age, Emotion emotion, Location location) implements Repairable {

    @Override
    public void repair() {
        System.out.println(this.name + " чинит обувь");
    }

    public void drink(){
        System.out.println(this.name + " размышляет о жизни...");
    }
}
