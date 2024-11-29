package ru.lomovskiy.lifecycle

class TransactionsScreenState(
    val transactions: List<TransactionRenderModel>
) {

    companion object {

        fun empty(): TransactionsScreenState {
            return TransactionsScreenState(emptyList())
        }

    }

}