package com.example.SpeakingClock.Exception;

public class InvalidTimeInputException extends RuntimeException {
    public InvalidTimeInputException(String message) {
        super(message);
    }
}

