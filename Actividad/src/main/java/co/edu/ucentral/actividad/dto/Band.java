package co.edu.ucentral.actividad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Band {

    private long id;
    private String name;
    private String genre;
    private int members;
    private String country;
    private int year;
    private String description;

}
