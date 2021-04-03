package com.example.roshi.datasource.mock

import com.example.roshi.datasource.BankDataSource
import com.example.roshi.model.Bank
import org.springframework.stereotype.Repository


@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 0.0, 1),
        Bank("1235", 0.1, 0),
        Bank("1236", 0.2, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: Int): Bank? {
        for (bank in banks) {
            if (bank.accountNumber == accountNumber.toString()) {
                return bank
            }
        }
        return  null
    }
}