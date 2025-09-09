import java.util.Arrays;
//Generics class and method to allow any type to access the method.
public class Digit <T>{
   //Help find the index of a T element in a T array
    public static <T> int indexOf (T[] component, T element)
    {
        return Arrays.asList(component).indexOf(element);
    }
}
