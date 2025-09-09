//Podcast Class presents other significant aspect of the show.
public class Podcast {
    private String episodeTitle;
    private int episodeNumber;
    private double episodeLength;

    //Constructor
    public Podcast(String episodeTitle, int episodeNumber, double episodeLength) {
        this.episodeTitle = episodeTitle;
        this.episodeNumber = episodeNumber;
        this.episodeLength = episodeLength;
    }

    //Lines 15-31 are the setters and getters methods
    public String getEpisodeTitle() {
        return episodeTitle;
    }
    public void setEpisodeTitle(String episodeTitle)
    {
        this.episodeTitle = episodeTitle;
    }
    public int getEpisodeNumber(){
        return episodeNumber;
    }
    public void setEpisodeNumber(int episodeNumber)
    {
        this.episodeNumber = episodeNumber;
    }
    public double getEpisodeLength(){
        return episodeLength;
    }

    //Override toString method that displays the attributes of the podcast.
    @Override
    public String toString(){
        return "Podcast: {EpisodeTitle = " + episodeTitle + ", EpisodeNumber = " + episodeNumber +  ", EpisodeLength = " + episodeLength + "}";
    }

}
