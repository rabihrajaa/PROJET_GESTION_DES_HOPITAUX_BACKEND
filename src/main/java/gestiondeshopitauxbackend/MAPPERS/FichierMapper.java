package gestiondeshopitauxbackend.MAPPERS;

import gestiondeshopitauxbackend.DTOS.FichierDTO;
import gestiondeshopitauxbackend.ENTITIES.Fichier;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class FichierMapper {
    public FichierDTO toDto(Fichier entity) {
        FichierDTO dto = new FichierDTO();
        BeanUtils.copyProperties(entity, dto);
        dto.setId(entity.getIdFichier());
        dto.setChemin(entity.getChemin());
        if (entity.getDossierMedical() != null) {
            dto.setDossierMedicalId(entity.getDossierMedical().getIdDossierMedical());
        }
        if (entity.getCategorieFichier() != null) {
            dto.setCategorieFichierId(entity.getCategorieFichier().getIdCategorieFichier());
            dto.setCategorieFichierNom(entity.getCategorieFichier().getNom());
        }
        if (entity.getTypeFichier() != null) {
            dto.setTypeFichierId(entity.getTypeFichier().getIdTypeFichier());
            dto.setTypeFichierNom(entity.getTypeFichier().getNom());
        }
        return dto;
    }

    public Fichier toEntity(FichierDTO dto) {
        Fichier entity = new Fichier();
        BeanUtils.copyProperties(dto, entity);
        entity.setIdFichier(dto.getId());
        return entity;
    }
}