package jms;

public class Calcultor {
    private String operator;
    private int number;

    public Calcultor(String operator, int number) {
        this.operator = operator;
        this.number = number;
    }
    public Calcultor() {
    }

    public String getOperator() {
        return operator;
    }

    public int getNumber() {
        return number;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
