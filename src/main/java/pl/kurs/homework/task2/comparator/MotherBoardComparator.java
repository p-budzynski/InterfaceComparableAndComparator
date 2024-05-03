package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;

import java.util.Comparator;

public class MotherBoardComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = o1.getMotherboard().getProducer().compareTo(o2.getMotherboard().getProducer());
        if (result == 0) {
            result = o1.getMotherboard().getModel().compareTo(o2.getMotherboard().getModel());
        }
        if (result == 0) {
            result = o1.getMotherboard().getSocket().compareTo(o2.getMotherboard().getSocket());
        }
        if (result == 0) {
            result = Integer.compare(o1.getMotherboard().getNumberMemorySlots(), o2.getMotherboard().getNumberMemorySlots());
        }
        return result;
    }
}
