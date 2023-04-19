package com.hydroqapi.Repository;

import com.hydroqapi.models.PowerOutage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerOutageRepository extends JpaRepository<PowerOutage,Long> {

}
