package pl.kurs.homework.task2.comparator;

import pl.kurs.homework.task2.model.Computer;

import java.util.Comparator;

public class GraphicCardComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        int result = o1.getGraphicsCard().getProducer().compareTo(o2.getGraphicsCard().getProducer());
        if (result == 0) {
            result = o1.getGraphicsCard().getModel().compareTo(o2.getGraphicsCard().getModel());
        }
        if (result == 0) {
            result = Integer.compare(o2.getGraphicsCard().getVramSize(), o1.getGraphicsCard().getVramSize());
        }
        if (result == 0) {
            result = Integer.compare(o2.getGraphicsCard().getBusWidthMbit(), o1.getGraphicsCard().getBusWidthMbit());
        }
        return result;
    }
}
