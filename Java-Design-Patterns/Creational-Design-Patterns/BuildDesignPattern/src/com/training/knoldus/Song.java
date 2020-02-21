package com.training.knoldus;

public class Song {
    //All final attributes
    private final String artistName; // required
    private final String songName; // required
    private final int releaseYear; // optional
    private final String albumName; // optional
    private final int trackNumber; // optional

    public Song(SongBuilder builder) {
        this.artistName = builder.artistName;
        this.songName = builder.songName;
        this.releaseYear = builder.releaseYear;
        this.albumName = builder.albumName;
        this.trackNumber = builder.trackNumber;
    }

    //All getter, and NO setter to provde immutability
    public String getArtistName() {
        return artistName;
    }
    public String getSongName() {
        return songName;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getAlbumName() {
        return albumName;
    }
    public int getTrackNumber() {
        return trackNumber;
    }

    @Override
    public String toString() {
        return "Song: " +
                this.artistName +
                ", " + this.songName +
                ", " + this.releaseYear +
                ", " + this.albumName +
                " , " + this.trackNumber;
    }

    public static class SongBuilder
    {
        private final String artistName;
        private final String songName;
        private int releaseYear;
        private String albumName;
        private int trackNumber;

        public SongBuilder(String artistName, String songName) {
            this.artistName = artistName;
            this.songName = songName;
        }
        public SongBuilder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }
        public SongBuilder albumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public SongBuilder trackNumber(int trackNumber) {
            this.trackNumber = trackNumber;
            return this;
        }
        //Return the finally consrcuted User object
        public Song build() {
            Song song =  new Song(this);
            return validateSongObject(song);
        }
        private Song validateSongObject(Song song) {
            //Assume song needs artistName and Song name to go into system
            if(song.getSongName().isBlank() || song.getArtistName().isBlank()){
                throw new IllegalArgumentException();
            }

            return song;
        }
    }
}
