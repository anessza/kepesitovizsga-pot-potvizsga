package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.numberofdigits;

public class NumberOfDigits {
    public int getNumberOfDigits(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result + (""+i).length();
        }
        return result;
    }
}
