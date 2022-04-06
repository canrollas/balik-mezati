package com.example.latest;

public class CreditCard {
    String owner;
    String cardNumber;
    String expressionDate;
    String CVC;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpressionDate() {
        return expressionDate;
    }

    public void setExpressionDate(String expressionDate) {
        this.expressionDate = expressionDate;
    }

    public String getCVC() {
        return CVC;
    }

    public void setCVC(String CVC) {
        this.CVC = CVC;
    }
}
