package com.GymVirtual.GymVirtual.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "membresias")
public class MembresiaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "Id_Membresia")
    private int idMembresia;

    private String titulo;
    private int costo;
    @Column(name = "tiempo_dias")
    private int tiempoDias;
    @Column(name = "Bin_Activo")
    private int binActivo;

}
