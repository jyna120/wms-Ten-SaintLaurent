package com.sh.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchItemDto {
    private long itemPk;
    private String itemNM;
    private int itemVol;
    private int itemCatPk;
    private long itemDetailPk;
    private String itemDetailSerialNum;
    private int itemDetailStatus;
    private long locatePk;
    private LocalDate itemDetailExpirationDt;
}
