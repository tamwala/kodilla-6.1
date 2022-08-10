package exception;

import com.example.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        try {
            fileReader.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
