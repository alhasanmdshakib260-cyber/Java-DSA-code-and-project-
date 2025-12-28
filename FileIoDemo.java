package company.com;

import java.io.*;

public class FileIoDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            writer.write("hello");
            writer.write("\nworld");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);


            }
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}


