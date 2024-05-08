package co.edu.ucentral.actividad.adapter;

import co.edu.ucentral.actividad.dto.Band;
import co.edu.ucentral.actividad.repository.BandRepository;
import co.edu.ucentral.actividad.repository.entity.BandEntity;
import co.edu.ucentral.actividad.service.BandService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BandAdapter implements BandService {

    private ModelMapper modelMapper;

    @Autowired
    private BandRepository bandRepository;

    @Override
    public void createBand(Band band) {
        bandRepository.save(modelMapper.map(band, BandEntity.class));
    }

    @Override
    public List<Band> getAllBands() {
        TypeToken<List<Band>> token = new TypeToken<>(){};
        return modelMapper.map(bandRepository.findAll(),token.getType());
    }



}
