package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        lamp.turnOn();

        Bed bed = new Bed("Modern", 4, 1, 2, 1);
        bed.make();

        Wardrobe wardrobe = new Wardrobe(2, 3, 50.5);
        wardrobe.add();

        Carpet carpet = new Carpet(5, 6, PaintColor.GREEN);
        carpet.lying();

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        ceiling.create();

        Wall wall1 = new Wall("North");
        wall1.create();
        Wall wall2 = new Wall("South");
        wall2.create();
        Wall wall3 = new Wall("West");
        wall3.create();
        Wall wall4 = new Wall("East");
        wall4.create();


        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Bed style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp type: " + bedroom.getLamp().getStyle());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());

    }
}