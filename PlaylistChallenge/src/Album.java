import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    //private ArrayList<Song> songs;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        //this.songs = new ArrayList<>();
        this.songs = new SongList();
    }
    // below functions can also be defined without using Iterator but using it to just get used to it
    public boolean addSong(String title, double duration) {

        return songs.add(new Song(title, duration));
//        Song song = findSong(title);
//        if(song==null) {
//            songs.add(new Song(title, duration));
//            return true;
//        }
//        return false;
    }
//    private Song findSong(String title) {
//        return songList.findSong(title);
////        for(Song song: songs) {
////            if(song.getTitle().equals(title)) {
////                return song;
////            }
////        }
////        return null;
//    }
    public boolean addToPlayList(int titleNumber, LinkedList<Song> playList) {
        if(titleNumber>0&&titleNumber<=songs.songs.size()) {
            playList.add(this.songs.songs.get(titleNumber-1));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = songs.findSong(title);
        if(song==null) {
            return false;
        }
        else {
            playList.add(song);
            return true;
        }
    }
    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }
        private boolean add(Song song) {
            if(findSong(song.getTitle())==null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }
        private Song findSong(String title) {
            for(Song song: this.songs) {
                if(song.getTitle().equals(title))
                    return song;
            }
            return null;
        }
        private Song findSong(int trackNumber) {
            if(trackNumber>0 && trackNumber<=this.songs.size()) {
                return this.songs.get(trackNumber-1);
            }
            return null;
        }
    }
}
