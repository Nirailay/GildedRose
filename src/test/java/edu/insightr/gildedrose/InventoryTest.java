package edu.insightr.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/* Le principe est d'intégré le principe de Conjure, sauf que UpdateQuality est degueu, donc fait "ameliorer" sans causer de bug"*/
class InventoryTest {
    @Test
    void updateQuality() {

        //SETUP
        Item vest = new Item("+5 Dexterity Vest", 9, 19);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = vest;
        Inventory inventTest=new Inventory(itemsTest);

        //Action
        inventTest.updateQuality();

        //TEST DU RESULTAT
        assertEquals(18,inventTest.getItems()[0].getQuality());
    }
        @Test
        void updateQualityLengendary() {

            //SETUP
            Item legendarySulfura = new Item(" Sulfuras, Hand of Ragnaros", 0, 80);
            Item[] itemsTest = new Item[1];
            itemsTest[0] = legendarySulfura;
            Inventory inventTest = new Inventory(itemsTest);

            //Action
            inventTest.updateQuality();

            //TEST DU RESULTAT
            assertEquals(80, inventTest.getItems()[0].getQuality());
        }

    @Test
    void updateQualityAgedBrie() {

        //SETUP
        Item agedBrie = new Item(" Aged Brie", 2, 0);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = agedBrie;
        Inventory inventTest = new Inventory(itemsTest);

        //Action
        inventTest.updateQuality();

        //TEST DU RESULTAT
        assertEquals(1, inventTest.getItems()[0].getQuality());
    }

    @Test
    void updateQualityConcert() {

        //SETUP
        Item concert = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = concert;
        Inventory inventTest = new Inventory(itemsTest);

        //Action
        inventTest.updateQuality();

        //TEST DU RESULTAT
        assertEquals(21, inventTest.getItems()[0].getQuality());
    }




    @Test
    void updateQualityConjured() {

        //SETUP
        Item vest = new Item("Conjured +5 Dexterity Vest", 9, 19);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = vest;
        Inventory inventTest=new Inventory(itemsTest);

        //Action
        inventTest.updateQuality();

        //TEST DU RESULTAT
        assertEquals(17,inventTest.getItems()[0].getQuality());


    }



}