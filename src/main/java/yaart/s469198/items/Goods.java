package yaart.s469198.items;


public class Goods extends Item {

    private int cost;

    public Goods(String name, int maxCount, int damage, int cost) {
        super(name, maxCount, damage);
        setCost(cost);
    }

    public Goods(String name, int maxCount, int damage, int cost, int count) {
        super(name, maxCount, damage, count);
        setCost(cost);
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        if (cost < 0)
            throw new IllegalArgumentException("cost is less than 0");
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString() + "Cost: " + cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (obj instanceof Goods other)
            return this.getName().equals(other.getName()) &&
                    this.getMaxCount() == other.getMaxCount() &&
                    this.getDamage() == other.getDamage() &&
                    this.cost == other.cost;

        return false;
    }


    @Override
    public int hashCode() {
        String stringToHash = String.format("%s %d %d %d %d", this.getName(), this.getCount(), this.getMaxCount(), this.getDamage(), this.getCount());
        return stringToHash.hashCode();
    }
}
