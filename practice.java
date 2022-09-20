import java.util.*;

class practice{
    //main method for testing
    public static void main(String[] args){
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Hi");
        c1.add("Chad");
        Collection<String> c2 = new ArrayDeque<>(c1);
        System.out.println(c2); // prints [Hi, Chad]

    }


}