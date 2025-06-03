package com.example.io.storage;

public interface StorageService {
  
  void init();

  void storage(MultipartFile file);

  Stream<Path> loadAll();

  Path load(String filename);

  Resource loadAsResource(String filename);

  void deleteAll();
  
}
