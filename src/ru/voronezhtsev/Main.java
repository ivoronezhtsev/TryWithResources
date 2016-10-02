package ru.voronezhtsev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static String readFirstLineFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(readFirstLineFromFile("C:\\simplefile.txt"));
    }
}
