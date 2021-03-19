package by.tms.home.springsecuritytraining.service;

import by.tms.home.springsecuritytraining.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Operation getResult(Operation operation) {
        switch (operation.getOperation()) {
            case "div":
                operation.setResult(div(operation.getNumberOne(), operation.getNumberTwo()));
                break;
            case "mult":
                operation.setResult(mul(operation.getNumberOne(), operation.getNumberTwo()));
                break;
            case "diff":
                operation.setResult(dif(operation.getNumberOne(), operation.getNumberTwo()));
                break;
            case "sum":
                operation.setResult(sum(operation.getNumberOne(), operation.getNumberTwo()));
                break;
            default:
                operation.setOperation("Wrong operation!");
                break;
        }
        return operation;
    }

    private double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    private double div(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    private double mul(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    private double dif(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }
}
