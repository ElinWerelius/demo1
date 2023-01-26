package com.example.demo1.controllers;
import com.example.demo1.models.Song;
import com.example.demo1.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/")
public class SongController {

    @Autowired
    SongService songService;

    @PostMapping("song")
    public Song createSong(@RequestBody Song song){
        return songService.songCreation(song);
    }
    @GetMapping("song/{id}")
    public Song getSongById(@PathVariable String id){
        return songService.getSongById(id);
    }
    @PutMapping("update")
    public Song updateSong(@RequestBody Song song){
        return songService.updateSong(song);
    }
    @DeleteMapping("delete/{id}")
    public String deleteSong(@PathVariable String id){
        return songService.deleteSong(id);
    }
    @GetMapping("songs")
    public List<Song> getAllSongs() {
        return songService.getAllSongs();}
}