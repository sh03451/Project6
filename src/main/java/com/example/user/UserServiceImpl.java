package com.myapp.member;
import com.myapp.member.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl {
    @Autowired
    UserDAO userDAO;
    public UserVO getUser(UserVO vo){
        return userDAO.getUser(vo);
    }
}
