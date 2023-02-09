public class Teilwortloeschen {

    public static void main(String[] args) {
//        System.out.println(istTeilwortAnIndex("cdeff", "ff", 3));
//        System.out.println(findeTeilwort("abcdeafb", "ab"));
//        System.out.println(loescheTeilwort("abcde", "cd"));
        String[] test= {"ab","aqd","aqc","aqq"};
        System.out.println(loescheAlleTeilworte("aaaaaddbdbc", test));
//        System.err.println("test");

    }

    public static boolean istTeilwortAnIndex(String w, String v, int i) {

        if (v.charAt(0) != w.charAt(i)) {
            return false;
        } else {
            for (int j = 1; j < v.length(); j++) {
                if (v.charAt(j) != w.charAt(i + j)) {
                    return false;
                }
            }
            return true;

        }

    }

    public static int findeTeilwort(String w, String v) {

        if (v.equals(w)) { // ist nicht notwendig zu schreiben
            return 0;
        } else {
            for (int i = 0; i < w.length(); i++) {
                if (v.charAt(0) == w.charAt(i)) {
                    boolean found = true;
                    for (int j = 1; j < v.length(); j++) {

                        if (v.charAt(j) != w.charAt(i + j)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        return i;
                    }
                }

            }
        }
        return -1;

    }

    public static String loescheTeilwort(String w, String v) {
        int loesche = findeTeilwort(w, v);
        if (loesche == -1) {
            return null;
        } else {
            String erg = "";
            for (int i = 0; i < w.length(); i++) {
                if (i < loesche || i > loesche + v.length() - 1) {
                    erg += w.charAt(i);

                }

            }
            return erg;
        }

    }

    public static String loescheAlleTeilworte(String w, String[] vArray) {



            for (int i = 0; i < vArray.length; i++) {
                String temp=loescheTeilwort(w, vArray[i]);
                System.out.println("i = " + i);
                if (temp != null) {
                    w = temp;
                    System.out.println("erg = " + w);
                    i = -1;
                }


            }

        return w;
    }

    public static String loescheAlleTeilworte2(String w, String[] vArray) {
        // w =aaaasadsad
        // bacl =aaaasadsad
        //

        boolean done=false;
        while (true) { // {a,a,a,b,d,b,c} w
            // {ab, ad} vA

            for (int i = 0; i < vArray.length; i++) {
                String temp=loescheTeilwort(w, vArray[i]);
                if (temp != null) {
                    w = temp;
                    done=false;
                    break;
                }
                else
                {
                    done=true;
                }
            }
            if(done)
                break;

            // w=s

        }
        return w;
    }


   static void testfor0()
    {
        for (int i = 0; i <9; i++) {
            System.out.println(i);
            if(i==1)
                i=       -1;
        }
    }
}