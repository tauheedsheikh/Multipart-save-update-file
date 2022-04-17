package com.alzohar.document.service;

import java.io.IOException;
import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import com.alzohar.document.entity.FileDB;
import com.alzohar.document.repository.FileDBRepository;

@Service
public class FileStorageService {

	@Autowired
	private FileDBRepository dbRepository;

	public FileDB store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileDB fileDB = new FileDB(fileName, file.getContentType(), fileName, file.getBytes());
		return dbRepository.save(fileDB);
	}

	public FileDB getFile(String id) {
		return dbRepository.getById(id);
	}
	public Stream<FileDB> getAllfile() {
		return dbRepository.findAll().stream();
	}
}
