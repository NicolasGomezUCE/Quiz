package co.edu.ucentral.actividad.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Band")
@Table(name = "BAND")
@Data
public class BandEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BAND")
    @SequenceGenerator(name = "SEQ_BAND", sequenceName = "SEQ_BAND", allocationSize = 1)
    private long id;
    private String name;
    private String genre;
    private int members;
    private String country;
    private int year;
    private String description;
}
