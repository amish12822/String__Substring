/**
 * substring
 */
public class substring {

    public static void main(String[] args) {
        
        String a = "Amish Kumar";

        // .substring(beg index , end index)

        // when we print first five char like index: (0,4)
        System.out.println(a.substring(0, 5));

        // when we print first five char like index: (6, to length of a)
        System.out.println(a.substring(6, a.length()));

    }
}