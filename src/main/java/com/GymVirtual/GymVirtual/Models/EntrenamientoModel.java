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
@Table(name = "entrenamientos")
public class EntrenamientoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Entrenamiento")
    private int idEntrenador;

    @Column(name = "Titulo_Entrenamiento")
    private String titulo;

    @Column(name = "Fecha_Entreno")
    private String fechaEntreno;

    @Column(name = "Bit_visto")
    private int bitVisto;

    @ManyToOne
    @JoinColumn(name = "Id_Cliente", referencedColumnName = "idCliente")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "Id_Entrenador", referencedColumnName = "idEntrenador")
    private EntrenadorModel entrenador;

    @ManyToOne
    @JoinColumn(name = "Id_video", referencedColumnName = "idVideo")
    private VideoModel video;

}
