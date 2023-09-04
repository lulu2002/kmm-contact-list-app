package com.plcoding.contactscomposemultiplatform

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact
import com.plcoding.contactscomposemultiplatform.contacts.presentation.ContactListScreen
import com.plcoding.contactscomposemultiplatform.contacts.presentation.ContactListState
import com.plcoding.contactscomposemultiplatform.contacts.presentation.components.ContactListItem
import com.plcoding.contactscomposemultiplatform.core.presentation.ContactListViewModel
import com.plcoding.contactscomposemultiplatform.core.presentation.ContactsTheme
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory


@Composable
fun App(darkTheme: Boolean, dynamicColor: Boolean) {
    ContactsTheme(darkTheme, dynamicColor) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val viewModel = getViewModel(
                key = "contact-list-screen",
                factory = viewModelFactory { ContactListViewModel() }
            )
            val state by viewModel.state.collectAsState()

            ContactListScreen(
                state = state,
                newContact = viewModel.newContact,
                onEvent = viewModel::onEvent

            )
        }
    }
}