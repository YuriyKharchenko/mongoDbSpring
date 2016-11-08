package com.app.application.service;

import com.app.application.dao.ContactDao;
import com.app.application.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContactService {

    @Autowired
    private ContactDao contactDao;

    public void add(Contact contact) {

        contactDao.save(contact);
    }

    public void update(Contact contact) {
        contactDao.save(contact);
    }

    public Contact get(String id) {
        return contactDao.get(id);
    }

    public List<Contact> getAll() {
        return contactDao.getAll();
    }

    public void remove(String id) {
        contactDao.remove(id);
    }
}
