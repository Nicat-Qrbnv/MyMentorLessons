package lesson12.homework;

public class Main {

    public static void main(String[] args) {

        Song song1 = new Song("Stairway to Heaven", "Led Zeppelin", 239);
        Song song2 = new Song("Feel Good Inc.", "Gorillaz", 215);
        Song song3 = new Song("Californication", "Red Hot Chili Peppers", 240);
        Song song4 = new Song("Hotel California", "Eagles", 176);
        Song song5 = new Song("Back in Black", "AC/DC", 190);

        Playlist playlist = new Playlist(5);

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);

        playlist.displaySongs();
    }
}

