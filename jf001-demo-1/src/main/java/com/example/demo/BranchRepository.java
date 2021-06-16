package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, String>
{

}
