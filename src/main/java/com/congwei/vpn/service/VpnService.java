package com.congwei.vpn.service;

import com.congwei.vpn.model.User;

import java.util.List;

public interface VpnService {

    List<User> queryList();

    User create(User user);

    User update(User user);
}
