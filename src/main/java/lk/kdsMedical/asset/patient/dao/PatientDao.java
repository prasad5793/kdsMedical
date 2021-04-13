package lk.kdsMedical.asset.patient.dao;

import lk.kdsMedical.asset.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends JpaRepository<Patient,Integer>{
// Patient findFirstByOderByIdDesc();
 Patient findByNic(String nic);
}
