package org.example.dao;


import org.example.domain.Items;


public interface ItemsDao {

    public Items findById(Integer id);
}
