package com.goujinbo.elementary;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class EightQueen {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(tryIt(n));
    }

    public static int tryIt(int n) {
        List<List<Coordinate>> lists = new ArrayList<>();
        for (int x = 1; x <= n; x++)
            for (int y = 1; y <= n; y++) {
                Coordinate coordinate = new Coordinate(x, y);
                if (x == 1) {
                    ArrayList<Coordinate> coordinates = new ArrayList<>();
                    coordinates.add(coordinate);
                    lists.add(coordinates);
                } else lists.addAll(add(lists, coordinate));
            }
        List<List<Coordinate>> collect = lists.stream().filter(l -> l.size() == n).collect(Collectors.toList());
        return collect.size();
    }

    public static List<List<Coordinate>> add(List<List<Coordinate>> coordinates, Coordinate coordinate) {
        List<List<Coordinate>> newCoordinates = new ArrayList<>();
        coordinates.forEach(l -> {
            //判断每一个元素，将符合规则的组合放到newCoordinates里
            AtomicBoolean t = new AtomicBoolean(true);
            l.stream().filter(c -> c.getY() == coordinate.getY() || c.getX() == coordinate.getX() ||
                    Math.abs(c.getX() - coordinate.getX()) == Math.abs(c.getY() - coordinate.getY())).map(c -> false).forEach(t::set);
            if (t.get()) {
                ArrayList<Coordinate> coordinates1 = new ArrayList<>();
                coordinates1.addAll(l);
                coordinates1.add(coordinate);
                newCoordinates.add(coordinates1);
            }
        });

        return newCoordinates;
    }


}


class Coordinate {

    private int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public Coordinate setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return this.y;
    }

    public Coordinate setY(int y) {
        this.y = y;
        return this;
    }

}
