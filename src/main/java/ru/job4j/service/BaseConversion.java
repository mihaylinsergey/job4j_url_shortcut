package ru.job4j.service;

import org.springframework.stereotype.Service;

@Service
public class BaseConversion {

    private static final String ALLOWED_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private char[] allowedCharacters = ALLOWED_STRING.toCharArray();
    private int base = allowedCharacters.length;

    public String encode(long input) {
        var encodedString = new StringBuilder();
        if (input == 0) {
            return String.valueOf(allowedCharacters[0]);
        }
        while (input > 0) {
            encodedString.append(allowedCharacters[(int) (input % base)]);
            input = input / base;
        }
        return encodedString.reverse().toString();
    }
}
