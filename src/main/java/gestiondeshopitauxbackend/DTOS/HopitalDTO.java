package gestiondeshopitauxbackend.DTOS;


import jakarta.persistence.*;
import lombok.Data;

@Data
public class HopitalDTO {
    private Long idHopital;
    private String nom;
    private String adresse;
    private String region;
    private String province;
    private String prefecture;
}