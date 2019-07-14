public enum CountMoney {
    PENNY(0.01,0), NICHEL(0.05,0), DIME(0.10,0), QUARTER(0.25,0), HALFDOLLAR(0.50,0), DOLLAR(1.00,0);
    private Double Value;
    private Integer Amount;
     CountMoney(Double value, Integer amount){
        Value = value;
        Amount = amount;
    }

    Double getValue(){
        return Value;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }
    Double Dollars(){
        double total = (CountMoney.PENNY.getAmount()*CountMoney.PENNY.getValue())
                     +(CountMoney.NICHEL.getAmount()*CountMoney.NICHEL.getValue())
                     +(CountMoney.DIME.getAmount()*CountMoney.DIME.getValue())
                     +(CountMoney.QUARTER.getAmount()*CountMoney.QUARTER.getValue())
                     +(CountMoney.HALFDOLLAR.getAmount()*CountMoney.HALFDOLLAR.getValue())
                     +(CountMoney.DOLLAR.getAmount()*CountMoney.DOLLAR.getValue());

        return total;
    }
}
