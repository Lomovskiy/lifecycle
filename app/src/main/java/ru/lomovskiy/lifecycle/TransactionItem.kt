package ru.lomovskiy.lifecycle

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TransactionItem(
    renderModel: TransactionRenderModel,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier= Modifier.padding(16.dp)
        ) {
            Text(text = renderModel.timestamp)
            Spacer(Modifier.height(8.dp))
            Text(text = renderModel.amount)
            Spacer(Modifier.height(8.dp))
            Text(text = renderModel.accountName)
        }
    }
}

@Preview
@Composable
fun TransactionItemPreview() {
    TransactionItem(renderModel = TransactionRenderModel.stub())
}
