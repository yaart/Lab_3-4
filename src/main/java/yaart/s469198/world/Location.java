package yaart.s469198.world;

public enum Location {

    MARKET("рынок"),
    HOUSE("дом"),
    BEDROOM("спальня"),
    KITCHEN("кухня"),
    FATHERSHOP("лавка отца");

    private String name;
    private Location(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}