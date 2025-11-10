class StringDemo{
    public static void main(String[] args) {
        //  String a = "ABCDE";
        String a = new String("ABCDE");
         a = a+"hello";
         System.out.println(a);
        // System.out.println(a.toLowerCase());
        // System.out.println(a);
        // StringBuilder strbldr = new StringBuilder(a);
        // System.out.println(strbldr.reverse());
// immutable - 
        // a[0] = 'A';
        // String result = "";
        // for (char i : a.toCharArray() )
        // {
        //     if (!result.contains(""+i))
        //     {
        //         result += i;
        //     }
        // }
        // System.out.println(result);

        // find the reverse of String
        StringBuffer s = new StringBuffer();
        s.append("hey");
        s.append("how are you");
        System.out.println(s);
    }
}