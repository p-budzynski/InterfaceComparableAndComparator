package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;
import pl.kurs.homework.task2.model.RandomAccessMemory;

import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        RandomAccessMemory ram1 = o1.getRam();
        RandomAccessMemory ram2 = o2.getRam();
        int result = Integer.compare(ram2.getSizeGB(), ram1.getSizeGB());
        if (result == 0) {
            result = Integer.compare(ram2.getFrequencyMHz(), ram1.getFrequencyMHz());
        }
        if (result == 0) {
            result = Character.compare(ram2.getDdrType(), ram1.getDdrType());
        }
        if (result == 0) {
            result = ram1.getProducer().compareTo(ram2.getProducer());
        }
        if (result == 0) {
            result = ram2.getModel().compareTo(ram1.getModel());
        }
        return result;
    }
}
