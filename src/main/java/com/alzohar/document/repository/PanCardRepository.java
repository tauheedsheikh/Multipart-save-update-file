package com.alzohar.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alzohar.document.entity.PanCardFile;

@Repository
public interface PanCardRepository extends JpaRepository<PanCardFile, String> {

}
