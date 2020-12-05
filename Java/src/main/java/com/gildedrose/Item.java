package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected void doUpdateQuality() {
            sellIn = sellIn - 1;
            if (quality > 0) {
                quality = quality - 1;
            }
            if (sellIn < 0) {
                if (quality > 0) {
                    quality = quality - 1;
                }
            }
    }
}
