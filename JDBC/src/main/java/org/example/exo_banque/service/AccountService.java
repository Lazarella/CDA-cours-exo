package org.example.exo_banque.service;

import org.example.exoPerson.utils.DatabaseManager;
import org.example.exo_banque.dao.AccountDAO;
import org.example.exo_banque.model.Account;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AccountService {
    private AccountDAO accountDAO;
    private Connection connection;

    public AccountService(){
        try {
            connection = new DatabaseManager().getConnection();
            accountDAO = new AccountDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean createAccount(double balance, int idClient){
        Account account = new Account(balance, idClient);
        account.set_clientId(idClient);
        try {
            return accountDAO.save(account);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean updateAccount(Account account){
        try {
            return accountDAO.update(account);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Account getAccount(int id){
        try {
            return (Account) accountDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public List<Account> getAllPersons(){
//        try {
//            return accountDAO.get_clientId();
//        }catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
