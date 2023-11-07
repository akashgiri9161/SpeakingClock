package com.example.SpeakingClock.Service;

import com.example.SpeakingClock.Exception.InvalidTimeFormatException;
import com.example.SpeakingClock.Exception.InvalidTimeInputException;

public class SpeakingClockService {

    public static String convertTimeToWords(String time) {
        String[] parts = time.split(":");
        if (parts.length != 2) {
            throw new InvalidTimeFormatException("Invalid time format. Use HH:mm.");
        }

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new InvalidTimeInputException("Invalid time input. Hours must be between 0-23 and minutes between 0-59.");
        }

        // The rest of the code remains the same
        String hourWords = convertNumberToWords(hours);
        String minuteWords = convertNumberToWords(minutes);
        return "It's " + hourWords + " " + minuteWords;
    }

    // Implement a method to convert numbers to words (e.g., "eight" for 8).

    private static String convertNumberToWords(int number) {
        // Implement this logic
        // You can use a map or a switch statement to map numbers to words.
        // For simplicity, you can just return the number as a string in this example.
        return Integer.toString(number);
    }
}
