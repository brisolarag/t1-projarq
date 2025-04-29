package br.edu.pucrs.brisolara.g.t1_projarq.extensions;

import java.util.ArrayList;

import br.edu.pucrs.brisolara.g.t1_projarq.models.Automovel;

public class MockDatabase {

    public static ArrayList<Automovel> getAutomoveis() {
        ArrayList<Automovel> automoveis = new ArrayList<>();
        automoveis.add(new Automovel("XXX-123", 2020, 100.50));
        automoveis.add(new Automovel("XXX-123", 2019, 100.50));
        automoveis.add(new Automovel("XXX-123", 2021, 100.50));
        automoveis.add(new Automovel("XXX-123", 2018, 100.50));
        automoveis.add(new Automovel("XXX-123", 2020, 100.50));
        automoveis.add(new Automovel("XXX-123", 2021, 100.50));
        automoveis.add(new Automovel("XXX-123", 2020, 100.50));
        automoveis.add(new Automovel("XXX-123", 2019, 100.50));
        automoveis.add(new Automovel("XXX-123", 2017, 100.50));
        automoveis.add(new Automovel("XXX-123", 2021, 100.50));
        return automoveis;
    }
}
