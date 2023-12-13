package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\12673\\eclipse-workspace\\Oct2023Java\\src\\notes";

        FileReader fileReader= new FileReader(path);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String str= null;
       while ((str =bufferedReader.readLine())!=null){
           System.out.println(str);

       }

    }
}
