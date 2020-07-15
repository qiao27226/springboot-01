package com.qf.service.impl;

import com.qf.mapper.SysUserMapper;
import com.qf.pojo.SysUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    SysUserMapper userMapper;

    @Override
    public List<SysUser> getAll() {
        return userMapper.selectByExample(null);
    }
}
