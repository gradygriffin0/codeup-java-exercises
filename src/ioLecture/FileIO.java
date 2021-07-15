package ioLecture;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
        System.out.println(getFilePath("test.txt"));
    }


    public static Path getFilePath(String filename){
        return Paths.get(filename);
    }

}
