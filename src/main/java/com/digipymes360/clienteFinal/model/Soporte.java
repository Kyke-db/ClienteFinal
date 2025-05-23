package com.digipymes360.clienteFinal.model;


import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Soporte")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Soporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_soporte;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_usuario")
    private Cliente id_cliente;

    @Column
    private String mensaje;

    @Column
    private String estado;

    @Column
    private Date fecha;


}