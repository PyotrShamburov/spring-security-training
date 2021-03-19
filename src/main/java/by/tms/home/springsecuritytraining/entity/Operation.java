package by.tms.home.springsecuritytraining.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    private double numberOne;
    private double numberTwo;
    private String operation;
    private double result;
}
