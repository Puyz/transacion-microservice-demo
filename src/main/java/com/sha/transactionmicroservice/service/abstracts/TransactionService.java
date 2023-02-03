package com.sha.transactionmicroservice.service.abstracts;

import com.sha.transactionmicroservice.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionByUserId(Long userId);
}
