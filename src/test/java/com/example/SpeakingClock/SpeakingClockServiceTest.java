package com.example.SpeakingClock;

import com.example.SpeakingClock.Service.SpeakingClockService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpeakingClockServiceTest {

    @Test
    public void testConvertTimeToWords() {
        assertEquals("It's eight thirty four", SpeakingClockService.convertTimeToWords("08:34"));
        assertEquals("It's Midday", SpeakingClockService.convertTimeToWords("12:00"));
        assertEquals("It's Midnight", SpeakingClockService.convertTimeToWords("00:00"));
    }

    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> SpeakingClockService.convertTimeToWords("1234"));
        assertThrows(IllegalArgumentException.class, () -> SpeakingClockService.convertTimeToWords("24:00"));
        assertThrows(IllegalArgumentException.class, () -> SpeakingClockService.convertTimeToWords("12:60"));
    }
}
