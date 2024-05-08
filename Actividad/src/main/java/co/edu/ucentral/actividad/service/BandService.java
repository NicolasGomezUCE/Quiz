package co.edu.ucentral.actividad.service;

import co.edu.ucentral.actividad.dto.Band;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BandService {
    public void createBand(Band band);
    public List<Band> getAllBands();
}
