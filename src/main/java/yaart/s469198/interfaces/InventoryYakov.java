package yaart.s469198.interfaces;

import yaart.s469198.items.Goods;

public interface InventoryYakov {

    void addItemToInventory(Goods good);

    Goods removeRandomItemFromInventory();

    void showInventory();
}