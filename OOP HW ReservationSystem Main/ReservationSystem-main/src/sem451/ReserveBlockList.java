package sem451;

import java.util.*;
import java.time.*;

public class ReserveBlockList {

    private List<ReserveBlock> reserveBlocks;

    public ReserveBlockList() {
        reserveBlocks = new ArrayList<>();
    }

    public void addReserveBlock(ReserveBlock reserveBlock) {
        reserveBlocks.add(reserveBlock);
    }

    public void removeReserveBlock(ReserveBlock reserveBlock) {
        reserveBlocks.remove(reserveBlock);
    }

    public List<ReserveBlock> getReserveBlocks() {
        return reserveBlocks;
    }

    public List<ReserveBlock> findReservedBlocksBy(Person person) {
        List<ReserveBlock> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.getBy().equals(person)) {
                result.add(block);
            }
        }
        return result;
    }

    public List<Person> findPeopleReservedBlock(ReserveBlock reserveBlock) {
        List<Person> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.equals(reserveBlock)) {
                result.add(block.getBy());
            }
        }
        return result;
    }

    public List<Integer> findHoursForReservedBlock(ReserveBlock reserveBlock, LocalDate date) {
        List<Integer> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.equals(reserveBlock) && block.getDate().equals(date)) {
                result.add(block.getClock());
            }
        }
        return result;
    }

    public List<LocalDate> findDatesForReservedBlock(ReserveBlock reserveBlock) {
        List<LocalDate> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.equals(reserveBlock)) {
                result.add(block.getDate());
            }
        }
        return result;
    }

    public List<ReserveBlock> findReservedBlockAt(int hour) {
        List<ReserveBlock> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.getClock() == hour) {
                result.add(block);
            }
        }
        return result;
    }

    public List<ReserveBlock> findReservedBlockAt(LocalDate date) {
        List<ReserveBlock> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.getDate().equals(date)) {
                result.add(block);
            }
        }
        return result;
    }

    public List<ReserveBlock> findReservedBlockAt(LocalDate date, int hour) {
        List<ReserveBlock> result = new ArrayList<>();
        for (ReserveBlock block : reserveBlocks) {
            if (block.getDate().equals(date) && block.getClock() == hour) {
                result.add(block);
            }
        }
        return result;
    }

    public void printReservedBlocks(List<ReserveBlock> reserveBlocks) {
        for (ReserveBlock block : reserveBlocks) {
            System.out.println(block);
        }
    }

}
