package com.example.main;

import com.example.io.FileReader;
import com.example.io.FileReaderException;

public class ExecptionModuloeRunner {

    public static void main(String[] args) {
//        FileReader fileReader = new FileReader();
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading a file");
//        }

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile("names.txt");
        } catch (Exception e) {
            System.out.println("Problem while reading a file");
        }

    }
}
