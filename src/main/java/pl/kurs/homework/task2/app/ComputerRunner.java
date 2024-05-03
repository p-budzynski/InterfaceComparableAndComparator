package pl.kurs.homework.task2.app;

import pl.kurs.homework.task2.comparator.*;
import pl.kurs.homework.task2.model.*;

import java.util.Arrays;
import java.util.Random;

public class ComputerRunner {
    public static void main(String[] args) {

        Motherboard[] motherboards = {
                new Motherboard("ASUS", "Prime X570-Pro", "AM4", 4),
                new Motherboard("Gigabyte", "B450 AORUS ELITE", "AM4", 4),
                new Motherboard("MSI", "MAG B550 TOMAHAWK", "AM4", 4),
                new Motherboard("ASRock", "B550M-ITX/ac", "AM4", 2),
                new Motherboard("EVGA", "Z490 FTW WiFi", "LGA1200", 4),
                new Motherboard("ASUS", "ROG Strix Z490-E Gaming", "LGA1200", 4),
                new Motherboard("MSI", "MEG Z590 ACE", "LGA1200", 4),
                new Motherboard("Gigabyte", "Z590 AORUS MASTER", "LGA1200", 4),
                new Motherboard("ASRock", "B550 Steel Legend", "AM4", 4),
                new Motherboard("ASUS", "TUF Gaming B550M-PLUS", "AM4", 4)
        };

        Processor[] processors = {
                new Processor("Intel", "Core i9-11900K", 3_500, 8, 14),
                new Processor("AMD", "Ryzen 9 5900X", 4_800, 12, 7),
                new Processor("Intel", "Core i5-11600K", 4_600, 6, 14),
                new Processor("AMD", "Ryzen 7 5800X", 4_700, 8, 7),
                new Processor("Intel", "Core i7-11700K", 3_600, 8, 14),
                new Processor("AMD", "Ryzen 5 5600X", 4_600, 6, 7),
                new Processor("Intel", "Core i9-10900K", 3_700, 10, 14),
                new Processor("AMD", "Ryzen 9 5950X", 4_900, 16, 7),
                new Processor("Intel", "Core i3-10100", 3_600, 4, 14),
                new Processor("AMD", "Ryzen 3 3300X", 3_800, 4, 7)
        };

        HardDrive[] hardDrives = {
                new HardDrive("SSD", 512, "Samsung", "970 EVO Plus"),
                new HardDrive("HDD", 2000, "Seagate", "Barracuda"),
                new HardDrive("SSD", 256, "Crucial", "MX500"),
                new HardDrive("HDD", 4000, "Western Digital", "WD Blue"),
                new HardDrive("SSD", 1000, "Kingston", "A2000"),
                new HardDrive("HDD", 1000, "Toshiba", "P300"),
                new HardDrive("SSD", 2000, "ADATA", "SU800"),
                new HardDrive("HDD", 6000, "Seagate", "IronWolf"),
                new HardDrive("SSD", 500, "SanDisk", "Ultra 3D"),
                new HardDrive("HDD", 8000, "Western Digital", "Red")
        };

        RandomAccessMemory[] rams = {
                new RandomAccessMemory(16, 3200, '4', "Corsair", "Vengeance LPX"),
                new RandomAccessMemory(32, 3600, '4', "G.Skill", "Ripjaws V"),
                new RandomAccessMemory(8, 2666, '4', "Crucial", "Ballistix Sport"),
                new RandomAccessMemory(64, 4000, '4', "Team Group", "T-Force Delta RGB"),
                new RandomAccessMemory(16, 3000, '4', "Kingston", "HyperX Fury"),
                new RandomAccessMemory(32, 3200, '4', "ADATA", "XPG Spectrix D60G"),
                new RandomAccessMemory(8, 2400, '4', "Patriot", "Viper Elite"),
                new RandomAccessMemory(64, 3600, '4', "HyperX", "Predator RGB"),
                new RandomAccessMemory(16, 3200, '4', "Team Group", "T-Force Vulcan Z"),
                new RandomAccessMemory(32, 4000, '4', "Corsair", "Dominator Platinum RGB")
        };

        GraphicsCard[] graphicsCards = {
                new GraphicsCard(256, 8, "GeForce RTX 3080", "NVIDIA"),
                new GraphicsCard(192, 12, "Radeon RX 6900 XT", "AMD"),
                new GraphicsCard(384, 10, "GeForce RTX 3090", "NVIDIA"),
                new GraphicsCard(128, 6, "Radeon RX 6800 XT", "AMD"),
                new GraphicsCard(256, 8, "GeForce RTX 3070", "NVIDIA"),
                new GraphicsCard(192, 8, "Radeon RX 6700 XT", "AMD"),
                new GraphicsCard(256, 6, "GeForce RTX 3060 Ti", "NVIDIA"),
                new GraphicsCard(128, 4, "Radeon RX 6600 XT", "AMD"),
                new GraphicsCard(192, 4, "GeForce RTX 3050 Ti", "NVIDIA"),
                new GraphicsCard(128, 8, "Radeon RX 6600", "AMD")
        };

        Computer[] computers = new Computer[20];

        for (int i = 0; i < 20; i++) {
            computers[i] = createComputer(motherboards, processors, hardDrives, rams, graphicsCards);
        }

        MotherBoardComparator motherBoardComparator = new MotherBoardComparator();
        Arrays.sort(computers, motherBoardComparator);
        for (Computer computer: computers) {
            System.out.println(computer.getMotherboard());
        }

        System.out.println("--------------------------------");

        ProcessorComparator processorComparator = new ProcessorComparator();
        Arrays.sort(computers, processorComparator);
        for (Computer computer: computers) {
            System.out.println(computer.getProcessor());
        }

        System.out.println("--------------------------------");

        HardDriveComparator hardDriveComparator = new HardDriveComparator();
        Arrays.sort(computers, hardDriveComparator);
        for (Computer computer: computers) {
            System.out.println(computer.getHardDrive());
        }

        System.out.println("--------------------------------");

        RamComparator ramComparator = new RamComparator();
        Arrays.sort(computers, ramComparator);
        for (Computer computer: computers) {
            System.out.println(computer.getRam());
        }

        System.out.println("--------------------------------");

        GraphicCardComparator graphicCardComparator = new GraphicCardComparator();
        Arrays.sort(computers, graphicCardComparator);
        for (Computer computer: computers) {
            System.out.println(computer.getGraphicsCard());
        }

    }

    public static Computer createComputer(Motherboard[] motherboards, Processor[] processors, HardDrive[] hardDrives, RandomAccessMemory[] rams, GraphicsCard[] graphicsCards) {
        Random random = new Random();
        Motherboard motherboard = motherboards[random.nextInt(motherboards.length)];
        Processor processor = processors[random.nextInt(processors.length)];
        HardDrive hardDrive = hardDrives[random.nextInt(hardDrives.length)];
        RandomAccessMemory ram = rams[random.nextInt(rams.length)];
        GraphicsCard graphicsCard = graphicsCards[random.nextInt(graphicsCards.length)];
        return new Computer(motherboard, processor, hardDrive, ram, graphicsCard);
    }
}
