package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;

import java.util.Comparator;

public class HardDriveComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = Integer.compare(o2.getHardDrive().getCapacity(), o1.getHardDrive().getCapacity());
        if (result == 0) {
            result = o1.getHardDrive().getType().compareTo(o2.getHardDrive().getType());
        }
        if (result == 0) {
            result = o1.getHardDrive().getProducer().compareTo(o2.getHardDrive().getProducer());
        }
        if (result == 0) {
            result = o2.getHardDrive().getModel().compareTo(o1.getHardDrive().getModel());
        }
        return result;
    }
}
