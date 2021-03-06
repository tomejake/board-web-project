package com.gram.service;

import com.gram.domain.User;
import com.gram.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    @Transient
    public void userJoin(User user){
        userRepository.save(User.builder()
                .userid(user.getUserid())
                .password(user.getPassword())
                .joinDate(LocalDateTime.now())
                .build());
    }

    public void findAll(){
        List<User> all = userRepository.findAll();
        for (User u: all) {
            System.out.println("idx = "+u.getIdx()+"\t id = " + u.getUserid() + "\t pw = " + u.getPassword() + "\t date = " + u.getJoinDate());
        }
    }

    public boolean login(User user) {
        User byUserid = userRepository.findByUserid(user.getUserid());
        boolean result = false;
        if (byUserid != null && byUserid.getPassword().equals(user.getPassword())){
            result = true;
        }
        return result;
    }

}
