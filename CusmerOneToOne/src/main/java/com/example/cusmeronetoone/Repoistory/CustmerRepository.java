package com.example.cusmeronetoone.Repoistory;

import com.example.cusmeronetoone.Model.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustmerRepository extends JpaRepository<Custmer,Integer> {
    Custmer findCustmerById(Integer id);
}
