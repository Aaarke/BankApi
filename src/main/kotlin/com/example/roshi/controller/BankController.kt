package com.example.roshi.controller

import com.example.roshi.model.Bank
import com.example.roshi.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {
    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: Int): Bank = service.getBank(accountNumber) ?: Bank("0", 2.0, 6799)

}