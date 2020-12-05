package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQuality_default() {
        Item[] items = new Item[] { new Item("Sfoo", 1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(0, app.items[0].quality);
        Assertions.assertEquals(0, app.items[0].sellIn);
    }
    @Test
    void updateQuality_sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(2, app.items[0].quality);
        Assertions.assertEquals(1, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Aged_Brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(2, app.items[0].quality);
        Assertions.assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Backstage() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(4, app.items[0].quality);
        Assertions.assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Backstage_sellIn_under_11() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(3, app.items[0].quality);
        Assertions.assertEquals(8, app.items[0].sellIn);
    }

    @Test
    void updateQuality_default_Quality_eq_to_50() {
        Item[] items = new Item[] { new Item("Sfoo", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(49, app.items[0].quality);
        Assertions.assertEquals(0, app.items[0].sellIn);
    }
    @Test
    void updateQuality_sulfuras_eq_to_50() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(50, app.items[0].quality);
        Assertions.assertEquals(1, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Aged_Brie_eq_to_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(50, app.items[0].quality);
        Assertions.assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Backstage_eq_to_50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(50, app.items[0].quality);
        Assertions.assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Backstage_sellIn_under_11_and_up_to_6_eq_to_50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(50, app.items[0].quality);
        Assertions.assertEquals(8, app.items[0].sellIn);
    }

    @Test
    void updateQuality_default_with_negatif_sellIn() {
        Item[] items = new Item[] { new Item("Sfoo", -1, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(0, app.items[0].quality);
        Assertions.assertEquals(-2, app.items[0].sellIn);
    }
    @Test
    void updateQuality_sulfuras_with_negatif_sellIn() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(2, app.items[0].quality);
        Assertions.assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Aged_Brie_with_negatif_sellIn() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(3, app.items[0].quality);
        Assertions.assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void updateQuality_Backstage_with_negatif_sellIn() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertEquals(0, app.items[0].quality);
        Assertions.assertEquals(-2, app.items[0].sellIn);
    }

}
