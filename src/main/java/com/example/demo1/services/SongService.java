
package com.example.demo1.services;
import com.example.demo1.models.Song;
import com.example.demo1.repositories.SongRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    public
    SongRepository songRepository;

    public Song songCreation(Song song){
        return songRepository.save(song);
    }
    public List<Song> getAllSongs(){
        return songRepository.findAll();
    }

    public Song updateSong(Song song){
        return songRepository.save(song);
    }
    public Song getSongById(String id){
        return songRepository.findById(id).get();
    }

    public String deleteSong(String id){
        songRepository.deleteById(id);
        return "The song has been deleted";
    }
}