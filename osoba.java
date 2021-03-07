package com.company;

public class osoba {

    private String imie, nazwisko;
    private int rokUrodzenia;
    public osoba(String imie,String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return String.format("%s %s rok urodzenia: %d" , imie ,nazwisko,rokUrodzenia);
    }
}