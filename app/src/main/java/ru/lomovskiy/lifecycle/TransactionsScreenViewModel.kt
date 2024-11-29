package ru.lomovskiy.lifecycle

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TransactionsScreenViewModel : ViewModel() {

    private val _state = MutableStateFlow(TransactionsScreenState.empty())
    val state: StateFlow<TransactionsScreenState> = _state.asStateFlow()

}
