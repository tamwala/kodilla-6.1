package com.example.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        //Path path = Paths.get(file.getPath());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            //Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            //System.out.println("Something went wrong" + e);
            throw new FileReaderException();
        } finally {
            System.out.println("I'm gonna to be here...always!");
        }
        System.out.println(file.getPath());
    }

    public void readFile(final String fileName) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        //Path path = Paths.get(file.getPath());

        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {
            //Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            //System.out.println("Something went wrong" + e);
            throw new FileReaderException();
        } finally {
            System.out.println("I'm gonna to be here...always!");
        }
    }

}
