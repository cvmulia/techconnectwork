package com.example.techconnect.boringfiles.repositories;

import com.example.techconnect.boringfiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
