package com.sha.transactionmicroservice.service.concretes;

import com.sha.transactionmicroservice.model.Transaction;
import com.sha.transactionmicroservice.repository.TransactionRepository;
import com.sha.transactionmicroservice.service.abstracts.TransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CTransactionManager implements TransactionService {
    private TransactionRepository transactionRepository;

    public CTransactionManager(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setTransactionTime(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);

    }

    @Override
    public List<Transaction> findAllTransactionByUserId(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }
}
