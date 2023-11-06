package com.GymVirtual.GymVirtual.Services;

import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Models.VideoModel;
import com.GymVirtual.GymVirtual.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    VideoRepository videoRepository;

    public void insertVideo(VideoModel video){
        videoRepository.save(video);
    }

    public List<VideoModel> getVideos(EntrenadorModel entrenadorModel){
        return videoRepository.findByEntrenador_IdEntrenador(entrenadorModel.getIdEntrenador());
    }
}
