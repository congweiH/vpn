package com.congwei.vpn.service;

import com.congwei.vpn.model.User;
import com.congwei.vpn.repository.VpnRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class VpnServiceImpl implements VpnService {

    @Autowired
    private VpnRepository vpnRepository;

    @Override
    public List<User> queryList() {
        return vpnRepository.findAll();
    }

    @Override
    public User create(User user) {
        return vpnRepository.save(user);
    }

    @Override
    public User update(User user) {
        return vpnRepository.save(user);
    }

    @Override
    public void delete(String email) {
        vpnRepository.deleteByEmail(email);
    }
}
