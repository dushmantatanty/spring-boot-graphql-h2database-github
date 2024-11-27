package com.example.test.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestUtil {
    public static String formatDateForLog(Date entryDate) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        return now.format(formatter);
    }

    public static LocalDate convertStartDate(Date startDate) {
        // Convert java.util.Date to java.time.LocalDate

        return startDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
