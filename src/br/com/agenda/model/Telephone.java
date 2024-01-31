package br.com.agenda.model;

import br.com.agenda.repository.ContactRepository;
import br.com.agenda.service.TelephoneService;

public class Telephone {
    private Long id;
    private String ddd;
    private Long number;

    public Telephone(String ddd, Long number) {
        this.ddd = ddd;
        this.number = number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        ddd = ddd.replaceAll(" ", "");
        ddd = ddd.replaceAll("\n", "");
        this.ddd = ddd;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}