package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;
import pl.kurs.homework.task2.model.Processor;

import java.util.Comparator;

public class ProcessorComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        Processor processor1 = o1.getProcessor();
        Processor processor2 = o2.getProcessor();
        int result = Integer.compare(processor2.getClockSpeed(), processor1.getClockSpeed());
        if (result == 0) {
            result = processor1.getProducer().compareTo(processor2.getProducer());
        }
        if (result == 0) {
            result = Integer.compare(processor2.getNumberOfCores(), processor1.getNumberOfCores());
        }
        if (result == 0) {
            result = Integer.compare(processor1.getNmTechnology(), processor2.getNmTechnology());
        }
        if (result == 0) {
            result = processor1.getModel().compareTo(processor2.getModel());
        }
        return result;
    }
}
