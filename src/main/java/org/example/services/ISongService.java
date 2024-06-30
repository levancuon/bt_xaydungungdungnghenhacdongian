package org.example.services;



import org.example.models.Song;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ISongService {
    List<Song> findAll();
    void addMusic(Song song);
    void update(int id, Song song);
    void delete(int id);
    Song findById(int id);
}
