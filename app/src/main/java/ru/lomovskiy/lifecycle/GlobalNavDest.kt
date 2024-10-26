package ru.lomovskiy.lifecycle;

import androidx.annotation.DrawableRes;

enum class GlobalNavDest(
        val path: String,
        @DrawableRes
        val iconResId: Int
) {
    TRANSACTIONS("transactions", R.drawable.ic_transactions_24),
    ACCOUNTS("accounts", R.drawable.ic_accounts_24),
    REPORTS("reports", R.drawable.ic_reports_24),
    SETTINGS("settings", R.drawable.ic_settings_24)
}
