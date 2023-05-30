package com.example.cusmeronetoone.Repoistory;

import com.example.cusmeronetoone.Model.Custmer;
import com.example.cusmeronetoone.Model.CustmerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustmerDetailsRepoistory extends JpaRepository<CustmerDetails,Integer> {

}
