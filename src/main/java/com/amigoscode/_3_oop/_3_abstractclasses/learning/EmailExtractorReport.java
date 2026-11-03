package com.amigoscode._3_oop._3_abstractclasses.learning;

import java.util.Locale;
import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
//            = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }
}
