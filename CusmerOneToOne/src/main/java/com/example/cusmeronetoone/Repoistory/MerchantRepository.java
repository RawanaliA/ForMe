package com.example.cusmeronetoone.Repoistory;

import com.example.cusmeronetoone.Model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant,Integer> {
    Merchant findMerchantById(Integer id);
}
