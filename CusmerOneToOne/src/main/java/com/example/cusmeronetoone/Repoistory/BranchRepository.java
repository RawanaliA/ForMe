package com.example.cusmeronetoone.Repoistory;

import com.example.cusmeronetoone.Model.Branch;
import com.example.cusmeronetoone.Model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
    Branch findBranchByid(Integer id);
}
