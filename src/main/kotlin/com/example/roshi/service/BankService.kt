package com.example.roshi.service

import com.example.roshi.datasource.BankDataSource
import com.example.roshi.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return bankDataSource.retrieveBanks()
    }

    fun getBank(accountNumber:Int):Bank{
        return bankDataSource.retrieveBank(accountNumber)
    }

}