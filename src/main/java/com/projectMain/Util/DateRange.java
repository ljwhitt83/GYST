package com.projectMain.Util;

import java.time.LocalDate;

public class DateRange {
    private final LocalDate start;
    private final LocalDate end;

    public DateRange(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public boolean has(LocalDate date) {
        return date.isAfter(start) && date.isBefore(end);
    }
}
