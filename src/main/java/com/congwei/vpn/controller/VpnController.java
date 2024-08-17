package com.congwei.vpn.controller;

import com.congwei.vpn.controller.requestbody.UserCreate;
import com.congwei.vpn.model.User;
import com.congwei.vpn.service.VpnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vpn")
public class VpnController {

    private final VpnService vpnService;

    @Autowired
    public VpnController(VpnService vpnService) {
        this.vpnService = vpnService;
    }

    @GetMapping
    public ResponseEntity<List<User>> get() {
        return ResponseEntity.ok(vpnService.queryList());
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserCreate userCreate) {
        User user = new User();
        user.setEmail(userCreate.getEmail());
        user.setDeadline(userCreate.getDeadline());
        return ResponseEntity.ok(vpnService.create(user));
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        return ResponseEntity.ok(vpnService.update(user));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@Param("email") String email) {
        vpnService.delete(email);
        return null;
    }

}
