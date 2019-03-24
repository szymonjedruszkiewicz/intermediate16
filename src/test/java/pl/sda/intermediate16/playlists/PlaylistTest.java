package pl.sda.intermediate16.playlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    protected Music music1 = new Music("Metallica","Sad but true");
    protected Music music2 = new Music("Kult","6 lat pozniej");
    protected Music music3 = new Music("U2","With or without you");
    protected Music music4 = new Music("Perfect","Autobiografia");
    protected Music music5 = new Music("David Bowie","Lazarus");
    protected Movie movie1 = new Movie("Bohemian Rhapsody");
    protected Movie movie2 = new Movie("Kevin sam w domu");
    protected Movie movie3 = new Movie("Janosik");
    protected Movie movie4 = new Movie("Sami swoi");

    @Test
    void shouldWorkProperlyWithRandomMode() {
        Playlist playlist = new Playlist(PlayMode.RANDOM);

    }
}