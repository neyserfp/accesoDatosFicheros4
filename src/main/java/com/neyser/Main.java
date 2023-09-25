package com.neyser;

import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //File file1 = new File("carpetaDatos1");
        File file1 = new File("carpetaDatos1/datos1.txt");

        /*
        File file2 = new File("carpetaDatos1");
        File file3 = new File("carpetaDatos1/datos1.txt");
        file2.mkdir();
        file3.createNewFile();
        */

        try
        {
            FileReader fileReader1 = new FileReader(file1);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            String strCurrentLine;
            while ((strCurrentLine=bufferedReader1.readLine()) != null)
            {
                System.out.println(strCurrentLine);
            }

            if (fileReader1 != null)
            {
                fileReader1.close();
            }

        } catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        } catch (IOException e2)
        {
            e2.printStackTrace();
        }
    }
}