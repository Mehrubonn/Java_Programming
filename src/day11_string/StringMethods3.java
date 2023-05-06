package day11_string;

import javax.lang.model.SourceVersion;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "Java";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        //---------------------------------------------------------------

        String str = "               ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //---------------------------------------------------------

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));

        //----------------------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        //---------------------------------------------------------------

        String students = "Hasab Naran Sumeve Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is Java";

        System.out.println("sentence = " + sentence);

        //--------------------------------------------

        String name = "Michael";

        boolean l = name.startsWith("Da");

        System.out.println(l);

        String upl = "www.cydeo.com";

        boolean isValid = upl.startsWith("www.");

        System.out.println(isValid);

        boolean t = upl.endsWith(".com");

        System.out.println(t);

        //-------------------------------------------------------

        String email = "CydeoScool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotMail = email.endsWith("HotMail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isHotMail = " + isHotMail);
        System.out.println("isYahoo = " + isYahoo);





























    }
}





