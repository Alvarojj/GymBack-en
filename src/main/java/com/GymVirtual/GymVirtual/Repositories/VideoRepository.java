package com.GymVirtual.GymVirtual.Repositories;

import com.GymVirtual.GymVirtual.Models.VideoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel, Integer> {
    List<VideoModel> findByEntrenador_IdEntrenador(int id);
}
