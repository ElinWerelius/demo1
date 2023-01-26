package com.example.demo1.repositories;
import com.example.demo1.models.Song;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface SongRepository extends JpaRepository <Song, String> {

   // List<Song> findSongByArtist(String Artist);
}
