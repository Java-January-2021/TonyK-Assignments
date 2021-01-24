import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song 1", "Hit the road Jack and don't you come back. No more.");
        trackList.put("Song 2", "I wanna be loved by you, just you. Nobody else but you");
        trackList.put("Song 3", "And now, the end is near. And so I face the final curtain");
        trackList.put("Song 4", "I've got you under my skin. I have got you, deep in the heart of me");
        trackList.put("Song 6", "I remember when I lost my mind. There was something so pleasant about that place");

        String single = trackList.get("Song 3");
        System.out.println(single);

        Set<String> keys = trackList.keySet();
        for (String key: keys) {
            System.out.println("Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}