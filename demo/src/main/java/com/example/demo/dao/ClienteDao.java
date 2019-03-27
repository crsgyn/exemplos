package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cliente;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Integer>{

}
