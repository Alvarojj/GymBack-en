package com.GymVirtual.GymVirtual.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "entrenadores")
public class EntrenadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "Id_Entrenador")
    private int idEntrenador;


    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Id_Persona", referencedColumnName = "idPersona")
    private PersonaModel idPersona;
}
