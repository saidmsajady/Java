package generics;

public class Main {

    public static void main(String[] args) {

        var max = Utils.max(new User(20), new User(30));
        System.out.println(max);
        
        // var list = new GenericList<String>();   
        // list.add("A");
        // list.add("B");
        // for ( var item : list )
        //     System.out.println(item); 
    }
}