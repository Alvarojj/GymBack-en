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
@Table(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "Id_Cliente")
    private int idCliente;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Persona",referencedColumnName = "idPersona")
    private PersonaModel idPersona;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Membresia", referencedColumnName = "idMembresia")
    private MembresiaModel membresia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Entrenador", referencedColumnName = "idEntrenador")
    private EntrenadorModel entrenador;
}
