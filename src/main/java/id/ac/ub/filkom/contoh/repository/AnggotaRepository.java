package id.ac.ub.filkom.contoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import id.ac.ub.filkom.contoh.entity.Anggota;

@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, String> {
}