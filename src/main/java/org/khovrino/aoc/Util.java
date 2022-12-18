package org.khovrino.aoc;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Util {

    public static <T extends Comparable<? super T>> T min(T... args) {
        if (args.length == 0) throw new NoSuchElementException();
        T min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i].compareTo(min) < 0) min = args[i];
        }
        return min;
    }

    public static <T extends Comparable<? super T>> T max(T... args) {
        if (args.length == 0) throw new NoSuchElementException();
        T max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i].compareTo(max) > 0) max = args[i];
        }
        return max;
    }

    public static <T extends Comparable<? super T>> T min(Collection<? extends T> args) {
        Iterator<? extends T> it = args.iterator();
        if (!it.hasNext()) throw new NoSuchElementException();
        T min = it.next();
        while (it.hasNext()) {
            T t = it.next();
            if (t.compareTo(min) < 0) min = t;
        }
        return min;
    }

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> args) {
        Iterator<? extends T> it = args.iterator();
        if (!it.hasNext()) throw new NoSuchElementException();
        T max = it.next();
        while (it.hasNext()) {
            T t = it.next();
            if (t.compareTo(max) > 0) max = t;
        }
        return max;
    }

    public static long fact(int n) {
        long f = 1L;
        while (n > 1) f = f * n--;
        return f;
    }

    public static List<Integer> ints(String s) {
        List<Integer> list = new LinkedList<>();
        int sgn = 1;
        int val = 0;
        int len = 0;
        for (int p = 0; p < s.length(); p++) {
            char c = s.charAt(p);
            if (p == '-') {
                sgn = -1;
            } else if ('0' <= c && c <= '9') {
                val = 10 * val + (c - '0');
                len++;
            } else {
                if (len > 0) {
                    list.add(sgn * val);
                    sgn = 1;
                    val = 0;
                    len = 0;
                }
            }
        }
        if (len > 0) {
            list.add(sgn * val);
        }
        return list;
    }

}
