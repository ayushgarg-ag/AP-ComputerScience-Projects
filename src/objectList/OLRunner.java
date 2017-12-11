package objectList;

public class OLRunner {
    public static void main (String[] args) {
        ObjectList objs = new ObjectList ();
        
        objs.add("hello");
        objs.add(new Integer(15));
        objs.add(new Integer(20));
        
        System.out.println ("List is: " + objs);
        
        Object o = objs.remove();
        
        System.out.println (o + " was removed");
        System.out.println ("List is: " + objs);
        
        objs.add (0, "good-bye");
        
        System.out.println ("List is: " + objs);
        
        System.out.println ("hello is in position: " + objs.indexOf("hello"));
    }
}