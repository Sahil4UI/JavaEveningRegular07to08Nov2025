public class StringMethods {
    public static void main(String[] args) {
        // String a = "Hey How are you?";

        // System.out.println(a.length());
        // System.out.println(a.toLowerCase());
        // System.out.println(a.toUpperCase());
        // String b = new String("Hey How are you?");
        // if (a.equals(b)){
        // System.out.println("Both are Equal");
        // }
        // else{
        // System.out.println("Both are different");
        // }
        // System.out.println(a.codePointAt(0));

        // a.codePoints().forEach(System.out::println);
        // System.out.println(a.contains("a"));
        // String p = "hey how are you?";
        // it will return the index of first occurence
        // System.out.println(a.indexOf('h'));
        // it will return the index of last occurence
        // System.out.println(p.lastIndexOf('h'));
        // System.out.println(p.indexOf('h',1));

        // find the number of vowels and consonants in a given String
        // String x = "Vanshika123";
        // String vowels = "aeiou";
        // int v_count = 0, c_count = 0;
        // for (char i : x.toLowerCase().toCharArray()) {
        //     if (i >= 'a' && i <= 'z') {
        //         if (vowels.contains("" + i)) {
        //             v_count++;
        //         } else {
        //             c_count++;
        //         }
        //     }
        // }
        // System.out.println("No of VOwels : " + v_count);
        // System.out.println("No of Cons : " + c_count);

        // String z = "welcome to ";
        // System.out.println(z.substring(0,2));
        // System.out.println(z.substring(3));
        // String l = "       java    ";
        // System.out.println(z.startsWith("W"));
        // System.out.println(z.endsWith("a"));
        // System.out.println(z+l);
        // System.out.println(z.concat(l.trim()));

        String k = "aaaaabbc";
        int occurence [] = new int [256];

        for (int i=0;i<k.length();i++)
        {
            // it will return ascii value
            occurence[k.codePointAt(i)]++;
        }

        for (int i=0;i< occurence.length;i++)
        {
            if (occurence[i]!=0)
            {
                System.out.println((char)i + " : "+occurence[i]);
            }
        }

        // a - 3
        //    b - 2
        //    c - 1
        // find the occurence of each character of String....

        // System.out.println(k.replace('e','E'));
        // System.out.println(k.replaceFirst("e","E"));


    }
}
