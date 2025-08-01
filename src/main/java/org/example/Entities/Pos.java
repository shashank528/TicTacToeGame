package org.example.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
public class Pos {
    int row;
    int col;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pos)) return false;
        Pos pos = (Pos) o;
        return row == pos.row && col == pos.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    @Override
    public String toString() {
        return "Pos{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
