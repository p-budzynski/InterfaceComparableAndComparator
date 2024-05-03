package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;

import java.util.Comparator;

public class ProcessorComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = Integer.compare(o2.getProcessor().getClockSpeed(), o1.getProcessor().getClockSpeed());
        if (result == 0) {
            result = o1.getProcessor().getProducer().compareTo(o2.getProcessor().getProducer());
        }
        if (result == 0) {
            result = Integer.compare(o2.getProcessor().getNumberOfCores(), o1.getProcessor().getNumberOfCores());
        }
        if (result == 0) {
            result = Integer.compare(o1.getProcessor().getNmTechnology(), o2.getProcessor().getNmTechnology());
        }
        if (result == 0) {
            result = o1.getProcessor().getModel().compareTo(o2.getProcessor().getModel());
        }
        return result;
    }
}
