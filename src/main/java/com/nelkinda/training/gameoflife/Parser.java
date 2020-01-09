package com.nelkinda.training.gameoflife;

import java.util.HashSet;
import java.util.Set;

import static com.nelkinda.training.gameoflife.Point.P;
import static java.util.Collections.unmodifiableSet;

enum Parser {
    ;

    static Universe parse(final String s) {
        final Set<Point> cells = new HashSet<>();
        int line = 0;
        int column = 0;
        for (final char c : s.toCharArray()) {
            switch (c) {
            case '\n':
                line++;
                column = 0;
                break;
            case 'x':
                cells.add(P(column, line));
                //fallthrough
            case '.':
                column++;
                break;
            default:
                throw new IllegalArgumentException("Unexpected character '" + c + "' at line " + line + ", column " + column);
            }
        }
        return new Universe(unmodifiableSet(cells));
    }
}
