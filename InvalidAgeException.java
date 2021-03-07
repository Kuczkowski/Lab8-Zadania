package com.company;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(osoba osoba, int rok) {
        super(String.format("Osoba %s nie istniala w roku %d" , osoba, rok));
    } }