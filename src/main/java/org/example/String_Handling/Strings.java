package org.example.String_Handling;

public class Strings {
    public static void main(String[] args) {


//        char ch;
//        ch = "abc".charAt(1);
//
//        System.out.println(ch);
//
//        String s = "This is a demo of the getChars method. ";
//        int start = 10;
//        int end = 14;
//
//        char buf[] = new char[end - start];
//
//        s.getChars(start,end,buf,0 );
//        System.out.println(buf);

        //Substring replacment.
//        String org = "This is a test. This is, too.";
//        String search = "is";
//        String sub = "was";
//        String result = "";
//        int i;
//
//        do { // replace all matching substrings
//            System.out.println(org);
//            i = org.indexOf(search);
//            if (1 != -1) {
//                result = org.substring(0, i);
//                result = result + sub;
//                result = result + org.substring(i + search.length());
//                org = result;
//            }
//        }while (i != -1) ;
//    }
//        String s = "Hello".replace('l','w');
//        System.out.println(s);

        String result = String.join(" ","Alpha","Beta","Gamma");
        System.out.println(result);

        result = String.join(", ", "Joh", "ID#: 569",
                                "E-mail: John@HerbSchildt.com");

        System.out.println(result);

        result = String.join(". ", "Joh", "ID#: 569",
                "E-mail: John@HerbSchildt.com");

        System.out.println(result);


    }
}

