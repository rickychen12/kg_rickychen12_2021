import java.util.Set;
import java.util.HashSet;

public class main {

    public static void main(String[] args) {

        if(args.length == 2){
            String s1 = args[0];
            String s2 = args[1];

            Set<Character> set = new HashSet<>();

            if(s1.length() > s2.length()){
                System.out.print("false");
                return;
            }

            for(Character c : s1.toCharArray()){
                if(set.add(c) == false) {
                    System.out.print("false");
                    return;
                }
            }
            System.out.print("true");
        }
    }
}
