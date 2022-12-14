package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDate;

@Entity
@Table(name = "hora_extra")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoraExtraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private LocalDate fecha;
    private Integer num_horas;
    private Long id_personal;
}
