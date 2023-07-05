package com.itschenxiang.first.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempAccessAccount {
    private String secretId;
    private String secretToken;
}
