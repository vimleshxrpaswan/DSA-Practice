package arrayandarraylist;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}

public class Problem {
    public static void main(String[] args) {
        String date = "20121212"; // Example input in yyyyMMdd format
        String requiredFormat = "yyyyMMdd";

        try {
            validateDateFormat(date, requiredFormat);

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(requiredFormat);
            LocalDate parsedDate = LocalDate.parse(date, inputFormatter);

            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            String formattedDate = parsedDate.format(outputFormatter);

            System.out.println("Formatted date: " + formattedDate);
        } catch (InvalidDateFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void validateDateFormat(String date, String requiredFormat) throws InvalidDateFormatException {
        if (!date.matches("\\d{8}") || !date.equals(requiredFormat)) {
            throw new InvalidDateFormatException("Invalid date format. Please enter the date in the format: " + requiredFormat);
        }
    }
}


