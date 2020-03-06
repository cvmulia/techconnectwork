package com.example.techconnect.boringfiles.components;

import com.example.techconnect.boringfiles.models.File;
import com.example.techconnect.boringfiles.models.Folder;
import com.example.techconnect.boringfiles.models.User;
import com.example.techconnect.boringfiles.repositories.FileRepository;
import com.example.techconnect.boringfiles.repositories.FolderRepository;
import com.example.techconnect.boringfiles.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}



    public void run(ApplicationArguments args){

        User user1 = new User("Emannuel");
        userRepository.save(user1);

        Folder folder1 = new Folder("work", user1);
        folderRepository.save(folder1);

        user1.addFolder(folder1);
        userRepository.save(user1);

        File file1 = new File("Resume",".txt", 12, folder1);
        fileRepository.save(file1);

        folder1.addFile(file1);
        folderRepository.save(folder1);


    }
}
