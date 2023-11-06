package com.GymVirtual.GymVirtual.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class VideoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "Id_Video")
    private int idVideo;
    @Column(name = "Path_Video")
    private String path;

    @ManyToOne
    @JoinColumn(name = "Id_Entrenador", referencedColumnName = "idEntrenador")
    private EntrenadorModel entrenador;
}
