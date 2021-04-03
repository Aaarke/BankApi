package com.example.roshi.datasource

import com.example.roshi.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber:Int): Bank
}