package com.umanizales.listas_se.listasse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KidByPositionDTO {
    private int position;
    private Kid kid;
}

