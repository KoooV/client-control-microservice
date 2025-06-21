package org.example.clientcontrolmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Status status;
    private Long id;

    public enum Status {
        ARRESTED,
        OPEN
    }
} 