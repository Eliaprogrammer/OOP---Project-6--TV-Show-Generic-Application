import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//This class will store the methods to handle the actions on the data.
//Add, remove, retrieving, sorting, and size
public class GenericsContainer<T> {
    private final List <T> content;
    public GenericsContainer() {
        content = new ArrayList<>();
    }

    //Adding to the container
    public void addItem(T contents)
    {
        content.add(contents);
    }

    //Removing from the container
    public void removeItem(T contents)
    {
        content.remove(contents);
    }

    //Sorting the container by an attribute
    public void sort(Comparator<? super T> items){
    content.sort(items);
    }

    //Retrieve a container
    public T getContent(T contents) {
        for(T item : content){
            if(contents == item){
                return item;
            }
        }
        return null;
    }

    //Determining the size of the container
    public int getSize() {
         return content.size();

    }

    //Method to print the full content of the container individually
    public void printContent(){
        for(T item : content){
            System.out.println(item);
        }
        System.out.println();

    }

    //The container content.
    @Override
    public String toString()
    {
        return "Content contains "  + content;
    }

}
