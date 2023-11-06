package com.GymVirtual.GymVirtual.Cotrollers;

import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Models.VideoModel;
import com.GymVirtual.GymVirtual.Services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("video")
public class VideoController {
    @Autowired
    VideoService videoService;

    @PostMapping
    public void insertVideo(@RequestBody  VideoModel video){
        videoService.insertVideo(video);
    }

    @GetMapping
    public List<VideoModel> getVideos(@RequestBody EntrenadorModel entrenadorModel){
        return videoService.getVideos(entrenadorModel);
    }

}
