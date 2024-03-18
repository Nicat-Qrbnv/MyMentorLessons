package lesson12.homework;

class Playlist {

    private Song[] songs;
    private int currentSize = 0;

    Playlist(int size) {
        songs = new Song[size];
    }

    boolean addSong(Song song) {
        if (currentSize >= songs.length) {
            return false;
        }
        songs[currentSize] = song;
        currentSize++;
        return true;
    }

    void displaySongs() {
        System.out.println("\nYour playlist: \n");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(songs[i]);
        }
    }
}

