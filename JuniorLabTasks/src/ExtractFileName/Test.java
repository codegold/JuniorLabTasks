package ExtractFileName;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        String fileName = "1231231_FILE_NAME.EXTENSION.OTHEREXTENSION";
        String extractedInfo = fileName.substring(fileName.indexOf("_") + 1, fileName.lastIndexOf("."));
        System.out.println(extractedInfo);

    }


}
