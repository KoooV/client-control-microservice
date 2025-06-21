package org.example.clientcontrolmicroservice;

import org.example.clientcontrolmicroservice.dto.ClientDto;
import org.example.clientcontrolmicroservice.dto.AccountDto;
import org.example.clientcontrolmicroservice.service.UnlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UnlockController {
    private final UnlockService unlockService;

    @Autowired
    public UnlockController(UnlockService unlockService) {
        this.unlockService = unlockService;
    }

    @PostMapping("/unblock-client")
    public String unblockClient(@RequestParam Long clientId) {
        return unlockService.tryUnblockClient(clientId);
    }

    @PostMapping("/unblock-account")
    public String unblockAccount(@RequestParam Long accountId) {
        return unlockService.tryUnblockAccount(accountId);
    }
} 