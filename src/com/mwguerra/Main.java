package com.mwguerra;

import com.mwguerra.models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota Yaris", "1.3 L Dual VVT-i");
        carro.setCambio(Carro.CAMBIO_AUTOMATICO);
        carro.setEnergia(Carro.ENERGIA_FLEX);
        carro.setCameraRe(true);

        carro.imprimeValores();
    }
}
