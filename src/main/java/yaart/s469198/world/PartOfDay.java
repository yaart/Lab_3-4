package yaart.s469198.world;

public enum PartOfDay {

    MORNING("утро"),
    AFTERNOON("день"),
    EVENING("вечер"),
    NIGHT("ночь");
    private String name;
    private PartOfDay(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}