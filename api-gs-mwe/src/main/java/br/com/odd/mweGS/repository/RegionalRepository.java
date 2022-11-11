package br.com.odd.mweGS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.odd.mweGS.model.Regional;

@Repository
public interface RegionalRepository extends JpaRepository<Regional, Integer>{

}
