package co.edu.ucentral.actividad.repository;

import co.edu.ucentral.actividad.repository.entity.BandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends JpaRepository<BandEntity,String> {
}
