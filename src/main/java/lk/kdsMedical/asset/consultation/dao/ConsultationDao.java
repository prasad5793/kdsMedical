package lk.kdsMedical.asset.consultation.dao;

import lk.kdsMedical.asset.consultation.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationDao extends JpaRepository<Consultation, Integer> {
}
