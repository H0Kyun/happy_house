package com.ssafy.house.user.dao;

import com.ssafy.house.user.data.entity.User;

public interface UserDAO {
  User selectUserByIdAndPassword(String userId, String userPassword);
}
