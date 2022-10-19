package com.umanizales.listas_se.listasse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RangeByAgeDTO {
    private int rangeStart;
    private int rangeEnd;
    private int quantity;
}