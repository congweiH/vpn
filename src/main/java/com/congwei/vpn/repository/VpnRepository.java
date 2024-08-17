package com.congwei.vpn.repository;

import com.congwei.vpn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VpnRepository extends JpaRepository<User, Long> {

}
