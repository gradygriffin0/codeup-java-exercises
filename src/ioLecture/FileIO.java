package ioLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FileIO {

    public static void main(String[] args) {
        init();


    }

    public static void init() {
        // try create directory
        Path path = FileDirectoryUtil.getPath("src", "ioLecture", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // try create file in new directory
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        // print final file path
        System.out.println(path.toAbsolutePath());

        IOUtil.tryPrintContents(path);

        IOUtil.tryWriteToFile(getContent(), path);

        IOUtil.tryPrintContents(path);


    }
    public static List<String> getContent(){
        List<String> contentToWrite = new ArrayList<String>();
        contentToWrite.add("String line 1 test");
        contentToWrite.add("String line 2 test2");
        contentToWrite.add("String line 3 test3");
        contentToWrite.add("String line 4 test4");
    return contentToWrite;
    }


}

