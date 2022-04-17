package com.alzohar.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alzohar.document.entity.FileDB;
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String>{
	

}
