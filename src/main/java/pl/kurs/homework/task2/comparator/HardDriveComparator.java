package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;
import pl.kurs.homework.task2.model.HardDrive;

import java.util.Comparator;

public class HardDriveComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        HardDrive hardDrive1 = o1.getHardDrive();
        HardDrive hardDrive2 = o2.getHardDrive();
        int result = Integer.compare(hardDrive2.getCapacity(), hardDrive1.getCapacity());
        if (result == 0) {
            result = hardDrive1.getType().compareTo(hardDrive2.getType());
        }
        if (result == 0) {
            result = hardDrive1.getProducer().compareTo(hardDrive2.getProducer());
        }
        if (result == 0) {
            result = hardDrive2.getModel().compareTo(hardDrive1.getModel());
        }
        return result;
    }
}
