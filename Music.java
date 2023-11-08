import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String Artist;


    public Music(String artist) {
        Artist = artist;
    }

    public void listen(User user){
        System.out.println("user :"+user.getUsername());
}


    public String getMediaType() {
        if(getPrice()>=10)
            return "premium music";
        else return "music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "Artist='" + Artist + '\'' +
                '}';
    }
}
