package com.example.SpeakingClock.Controller;

import com.example.SpeakingClock.Exception.InvalidTimeFormatException;
import com.example.SpeakingClock.Exception.InvalidTimeInputException;
import com.example.SpeakingClock.Service.SpeakingClockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeakingClockController {

    @GetMapping("/convertTime")
    public ResponseEntity<String> convertTimeToWords(@RequestParam String time) {
        try {
            String result = SpeakingClockService.convertTimeToWords(time);
            return ResponseEntity.ok(result);
        } catch (InvalidTimeFormatException e) {
            return ResponseEntity.badRequest().body("Invalid time format. Use HH:mm.");
        } catch (InvalidTimeInputException e) {
            return ResponseEntity.badRequest().body("Invalid time input. Hours must be between 0-23 and minutes between 0-59.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid input.");
        }
    }
}
