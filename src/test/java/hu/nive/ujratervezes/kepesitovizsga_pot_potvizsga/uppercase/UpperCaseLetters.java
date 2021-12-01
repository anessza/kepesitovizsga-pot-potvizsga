package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.uppercase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class UpperCaseLetters {

    public int countLetter(String s) {
        int count = 0;
        String s2 = s.toLowerCase();
        char[] st1 = s.toCharArray();
        char[] st2 = s2.toCharArray();
        for (int i=0; i< s.length(); i++) {
            if ((st1[i]) > 10 && (st1[i]) < (st2[i]))
                {
                    count++;
                }
        }
        return count;
    }

    public int getNumberOfUpperCase(Path path) {
        Path file = Path.of(String.valueOf(path));
        int result = 0;

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null)
            {
                result = result + countLetter(line);
            }
            return result;
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("Can't find file: " + fnfe.getMessage());
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
        return result;
    }
}
