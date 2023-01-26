package com.example.demo1.models;
import jakarta.persistence.*;

@Entity
@Table (name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "writer")
    private String writer;
    @Column(name = "artist")
    private String artist;
    @Column(name = "track_number")
    private Integer trackNumber;

    public Song() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumbers) {
        this.trackNumber = trackNumbers;
    }
}
