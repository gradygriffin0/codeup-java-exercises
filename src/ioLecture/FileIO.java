package ioLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());
        System.out.println(doesPathExist(getFilePath("src", "ioLecture", "test.txt")));
//        tryCreateDirectory(getFilePath("src", "ioLecture", "test.txt"));
        tryCreateFile(getFilePath("src", "ioLecture", "test1.txt"));
    }


    public static Path getFilePath(String filename) {
        return Paths.get(filename);
    }

    public static Path getFilePath(String parentDirectory, String fileName) {
        return Paths.get(parentDirectory, fileName);
    }

    //    with Path.get() =>
//from furthest out directory, to most inner directory, to file
    public static Path getFilePath(String parentDirectory, String childName, String fileName) {
        return Paths.get(parentDirectory, childName, fileName);
    }


    public static Boolean doesPathExist(Path path) {
        return Files.exists(path);
    }

    public static void tryCreateDirectory(Path pathToCreate) {

        if (!doesPathExist(pathToCreate)) {
            try {
                Files.createDirectory(pathToCreate);
            } catch (IOException e) {
                System.out.println("Couldn't create directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());

            }
        } else {
            System.out.println("Path Exists at " + pathToCreate.toAbsolutePath());

        }
    }
    public static void tryCreateFile(Path pathToCreate) {

        if (!doesPathExist(pathToCreate)) {
            try {
                Files.createFile(pathToCreate);
            } catch (IOException e) {
                System.out.println("Couldn't create file at: ");
                System.out.println(pathToCreate.toAbsolutePath());

            }
        } else {
            System.out.println("Path Exists at " + pathToCreate.toAbsolutePath());

        }
    }
}
