import java.util.Comparator;
//Elia Schwartz, COP 3330C - 33777, June 18, 2025.
/*The purpose of this code is to understand how to create and use generics
to manage information. (e.g., Add, Remove, retrieve, get size, sort, and print data).
This generics program is based on the Hulu TV show "Only Murders in the Building".
 */
public class TvShowApp {
    public static void main(String[] args) {

        GenericsContainer <Tenant> tenants = new GenericsContainer<>();
        GenericsContainer <MurderBoard> murderBoards = new GenericsContainer<>();
        GenericsContainer <Podcast> podcast = new GenericsContainer<>();

        //Tenant objects
        Tenant mabel = new Tenant("Mabel Mora", 12, 'E', "Amateur podcast investigator");
        Tenant charles = new Tenant("Charles-Haden Savage", 14, 'C', "Amateur podcast investigator");
        Tenant oliver = new Tenant("Oliver Putnam", 14, 'C', "Amateur podcast investigator");
        Tenant howard = new Tenant("Howard Morris", 3, 'C', "Intrigue neighbor wanting to help");

        //MurderBoard objects
        MurderBoard tim = new MurderBoard("Tim Kono", "Tie-Dye Guy", true);
        MurderBoard bunny = new MurderBoard("Bunny Folger", "Poppy White", true);
        MurderBoard ben =  new MurderBoard("Ben Glenroy", "Loretta Durkin", false);
        MurderBoard sazz = new MurderBoard("Sazz Pataski", "Vince Fish", false);

        //Podcast objects
        Podcast season1 = new Podcast("True Crime", 1, 33.0);
        Podcast season2 = new Podcast("The Last Day of Bunny Folger", 3, 29.59);
        Podcast season3 = new Podcast("Sitzprobe", 8, 39.05);
        Podcast season4 = new Podcast("My best Friend's Wedding", 10, 36.0);
        Podcast season5 = new Podcast("Lester's Secret Life", 5, 30.55);

        //Adding items to the tenants list.
        tenants.addItem(mabel);
        tenants.addItem(charles);
        tenants.addItem(oliver);

        //Adding items to the murderBoard list.
        murderBoards.addItem(tim);
        murderBoards.addItem(bunny);
        murderBoards.addItem(ben);
        murderBoards.addItem(sazz);

        //Adding items to the podcast list.
        podcast.addItem(season1);
        podcast.addItem(season2);
        podcast.addItem(season3);
        podcast.addItem(season4);
        podcast.addItem(season5);

        System.out.println("------------Original----------------");
        //Printing content of each container
        tenants.printContent();
        murderBoards.printContent();
        podcast.printContent();

        //Printing out toString
        System.out.println(tenants);
        System.out.println(murderBoards);
        System.out.println(podcast);

        System.out.println();
        //Printing the size of the container.
        System.out.println("The size of the tenant content is " + tenants.getSize());
        System.out.println("The size of the murder board content is " + murderBoards.getSize());
        System.out.println("The size of the murder board content is " + podcast.getSize());

        //Adding addition element
        tenants.addItem(howard);
        //Removing an element
        podcast.removeItem(season5);

        //Sorting by category
        tenants.sort(Comparator.comparing(Tenant::getAptNumber));
        murderBoards.sort(Comparator.comparing(MurderBoard::getAssailant));
        podcast.sort(Comparator.comparing(Podcast::getEpisodeTitle));

        //Retrieving
        System.out.println(tenants.getContent(mabel));

        System.out.println("------------Updated Version----------------");
        //Printing the updated version of the content.
        System.out.println("The tenants are sorted by their apartment number.");
        tenants.printContent();
        System.out.println("The murder boards are sorted by the assailant.");
        murderBoards.printContent();
        System.out.println("The podcasts are sorted by their episode title.");
        podcast.printContent();

        //Printing out toString
        System.out.println(tenants);
        System.out.println(murderBoards);
        System.out.println(podcast);

        System.out.println();
        //Printing the size of the container.
        System.out.println("The size of the tenant content is " + tenants.getSize());
        System.out.println("The size of the murder board content is " + murderBoards.getSize());
        System.out.println("The size of the murder board content is " + podcast.getSize());

    }
}
