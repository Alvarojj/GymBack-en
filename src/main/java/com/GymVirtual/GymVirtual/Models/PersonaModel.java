package com.GymVirtual.GymVirtual.Models;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personas")
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "Id_Persona")
    private int idPersona;

    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Peso")
    private float peso;
    @Column(name = "Estatura")
    private float estatura;
    @Column(name = "Fecha_Nacimiento")
    private String fechaNacimiento;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Clave")
    private String clave;
}
