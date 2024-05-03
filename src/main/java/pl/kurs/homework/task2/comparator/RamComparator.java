package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;

import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = Integer.compare(o2.getRam().getSizeGB(), o1.getRam().getSizeGB());
        if (result == 0) {
            result = Integer.compare(o2.getRam().getFrequencyMHz(), o1.getRam().getFrequencyMHz());
        }
        if (result == 0) {
            result = Character.compare(o2.getRam().getDdrType(), o1.getRam().getDdrType());
        }
        if (result == 0) {
            result = o1.getRam().getProducer().compareTo(o2.getRam().getProducer());
        }
        if (result == 0) {
            result = o2.getRam().getModel().compareTo(o1.getRam().getModel());
        }
        return result;
    }
}
