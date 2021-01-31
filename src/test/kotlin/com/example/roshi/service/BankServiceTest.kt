package com.example.roshi.service

import com.example.roshi.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest {
    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call it's data source to retrieve banks `() {
        //When
       bankService.getBanks()
        //Then
        verify(exactly = 1) {
            dataSource.retrieveBanks()
        }
    }
}