package reader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class InputTest {

    public static void main(String[] args) throws IOException {
        System.out.println("----------------------");
        System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));

            while ((c = in.read()) >- 0) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
