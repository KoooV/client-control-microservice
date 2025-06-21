package org.example.clientcontrolmicroservice.service;

import org.example.clientcontrolmicroservice.dto.AccountDto;
import org.example.clientcontrolmicroservice.dto.ClientDto;
import org.springframework.stereotype.Service;;
import java.util.Random;

@Service
public class UnlockService {

    private final Random random = new Random();


    public String tryUnblockClient(Long clientId) {
        if (random.nextBoolean()){
            return ClientDto.Status.ACTIVE.toString();
        }
        return ClientDto.Status.BLOCKED.toString();
    }

    public String tryUnblockAccount(Long accountId) {
        if(random.nextBoolean()){
            return AccountDto.Status.OPEN.toString();
        }
        return AccountDto.Status.ARRESTED.toString();

    }
}
