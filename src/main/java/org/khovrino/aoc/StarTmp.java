package org.khovrino.aoc;

import java.io.*;
import java.math.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class StarTmp {

    public static final String REAL_INPUT_FILEPATH = "C:\\Users\\egor\\Downloads\\input.txt";
    public static final String EXAMPLE_INPUT_FILEPATH = "C:\\Users\\egor\\Downloads\\example.txt";
    public static final String EXPECTED_EXAMPLE_OUTPUT = "example";

    public static final Pattern PATTERN = Pattern.compile("some static text.?: (.*)");

    public static void main(String[] args) throws IOException {
        String exampleOutput = Objects.toString(solve(EXAMPLE_INPUT_FILEPATH));
        if (EXPECTED_EXAMPLE_OUTPUT.equals(exampleOutput)) {
            throw new IllegalStateException(String.format(
                    "FAILURE%n%nexpected:    %s%nencountered: %s%n", EXPECTED_EXAMPLE_OUTPUT, exampleOutput));
        }
        String realOutput = Objects.toString(solve(REAL_INPUT_FILEPATH));
        System.out.printf("%nSUCCESS. Output: '%s'%n", realOutput);

    }

    public static Object solve(String inputFilepath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilepath), StandardCharsets.UTF_8))) {

            //line input
            String line;
            while((line = reader.readLine()) != null) {
                if (line.startsWith("property1: ")) {
                    String property1 = line.substring("property1: ".length());
                }
                Matcher matcher = PATTERN.matcher(line);
                if (matcher.matches()) {
                    String group1 = matcher.group(1);
                } else {
                    //throw new IllegalArgumentException("not matches");
                }

            }

            // char input
            long pos = 0;
            int chr;
            StringBuilder sb = new StringBuilder();
            while ((chr = reader.read()) != -1) {
                sb.append((char) chr);
            }

            return 0;
        }

    }
}
