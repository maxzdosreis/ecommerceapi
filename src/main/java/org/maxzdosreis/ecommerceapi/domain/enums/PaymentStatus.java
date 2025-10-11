package org.maxzdosreis.ecommerceapi.domain.enums;

public enum PaymentStatus {

    ABERTO(1, "Aberto"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private int cod;
    private String description;

    private PaymentStatus(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static PaymentStatus toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (PaymentStatus s : PaymentStatus.values()) {
            if (cod.equals(s.getCod())) {
                return s;
            }
        }

        throw new IllegalArgumentException("Invalid value for TypeCustomer: " + cod);
    }
}
