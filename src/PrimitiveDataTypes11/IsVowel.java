package PrimitiveDataTypes11;

public class IsVowel {
    public static void main(String[] args) {
        isVowelEx3 myChar = new isVowelEx3('B');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        myChar.printLowerCaseAlphabets();
        myChar.printUpperCaseAlphabets();
    }
}
