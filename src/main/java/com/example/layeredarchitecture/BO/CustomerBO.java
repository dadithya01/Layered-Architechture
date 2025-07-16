package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;
    public Boolean saveCustomer(CustomerDTO customerDTO) throws SQLException,ClassNotFoundException ;
    public Boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    public Boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    public String  newId() throws SQLException, ClassNotFoundException;
    public Boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
}