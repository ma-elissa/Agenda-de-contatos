package br.com.agenda.details;

import br.com.agenda.data.base.ContactList;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Long id;
    private String name;
    private String surname;
    private List<Telephone> telephones = new ArrayList<Telephone>();

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public Long getId() {
        return id;
    }

    public void setId(ContactList contactList) {
        this.id = !contactList.isEmpty() ? contactList.nextIdContact() : 0L;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void addTelephones(Telephone newTelephone) {
        this.telephones.add(newTelephone);
    }

    public String formatPhoneList() {
        String formated = "";
        for (Telephone element : this.telephones) {
            formated += (element.getId() + "\u001B[33m" + " | " + "\u001B[0m" + " (" + element.getDdd() + ")" + element.getNumber() + "\n"); //add yellow
        }
        return formated;
    }
}