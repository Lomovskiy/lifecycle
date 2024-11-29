package ru.lomovskiy.lifecycle

import java.util.UUID

class TransactionRenderModel(
    val id: String,
    val timestamp: String,
    val amount: String,
    val accountName: String
) {

    companion object {

        fun stub(): TransactionRenderModel {
            return TransactionRenderModel(
                id = UUID.randomUUID().toString(),
                timestamp = "01.01.1970",
                amount = "1234.56",
                accountName = "Sber 2202"
            )
        }

    }

}