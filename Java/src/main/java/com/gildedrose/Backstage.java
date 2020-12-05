package com.gildedrose;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        sellIn = sellIn - 1;
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11) {
                quality = quality + 1;
            }

            if (sellIn < 6) {
                quality = quality + 1;
            }
        }
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
