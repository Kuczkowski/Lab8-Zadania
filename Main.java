package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj imię:");
            String imie = scan.nextLine();
            System.out.println("Podaj nazwisko:");
            String nazwisko = scan.nextLine();
            System.out.println("Podaj rok urodzenia:");
            int rok = scan.nextInt();
        osoba ktos = new osoba(imie,nazwisko, rok);
        try {
            System.out.println(obliczWiekOsobyWDanymRoku(ktos,2020));
        }catch (InvalidAgeException e) {
            System.out.println("Podano nieprawidlowy rok! " + e.getMessage());
        }finally {
            System.out.println("Koniec");
            return;
        } }}

    private static int obliczWiekOsobyWDanymRoku(osoba osoba,int rok) {
        int wiek = rok-osoba.getRokUrodzenia();
        if(wiek<0) {
            throw new InvalidAgeException(osoba, rok);
        }else
            System.out.println("W 2020 roku osoba ta ma lat:");
            return wiek;
        } }