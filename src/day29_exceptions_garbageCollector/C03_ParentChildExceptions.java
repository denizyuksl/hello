package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ParentChildExceptions {

    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("src/day28_exceptions/text.txt");
        } catch (FileNotFoundException e) {
            
        }
    }
}
