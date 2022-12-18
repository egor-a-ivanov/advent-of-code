package org.khovrino.aoc;

import java.util.Objects;

public final class Point {

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static final Point ZERO = Point.of(0, 0);
    public static final Point ONE_STEP_UP = Point.of(0, 1);
    public static final Point ONE_STEP_DOWN = Point.of(0, -1);
    public static final Point ONE_STEP_LEFT = Point.of(-1, 0);
    public static final Point ONE_STEP_RIGHT = Point.of(1, 0);

    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point negate() {
        return of(-x, -y);
    }

    public Point add(Point that) {
        return of(this.x + that.x, this.y + that.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
