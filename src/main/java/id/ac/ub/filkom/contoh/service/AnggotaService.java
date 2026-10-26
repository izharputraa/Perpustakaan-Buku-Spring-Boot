package id.ac.ub.filkom.contoh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import id.ac.ub.filkom.contoh.entity.Anggota;
import id.ac.ub.filkom.contoh.repository.AnggotaRepository;

import java.util.List;

@Service
public class AnggotaService {

    @Autowired
    private AnggotaRepository anggotaRepository;

    public List<Anggota> getAllAnggota() {
        return anggotaRepository.findAll();
    }

    public void saveAnggota(Anggota anggota) {
        anggotaRepository.save(anggota);
    }
}