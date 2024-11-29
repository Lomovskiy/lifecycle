package ru.lomovskiy.lifecycle

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TransactionsScreen(
    viewModel: TransactionsScreenViewModel,
    modifier: Modifier = Modifier
) {
    val state = viewModel.state.collectAsState()
    TransactionsScreenInternal(
        items = state.value.transactions,
        modifier = modifier
    )
}

@Composable
private fun TransactionsScreenInternal(
    items: List<TransactionRenderModel>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(items) {
            TransactionItem(it)
        }
    }
}

@Preview
@Composable
fun TransactionScreenPreview() {
    TransactionsScreenInternal(listOf(TransactionRenderModel.stub(), TransactionRenderModel.stub()))
}