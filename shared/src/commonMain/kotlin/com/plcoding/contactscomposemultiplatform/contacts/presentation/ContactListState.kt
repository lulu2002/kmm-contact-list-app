package com.plcoding.contactscomposemultiplatform.contacts.presentation

import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact

data class ContactListState(
    val contacts: List<Contact> = emptyList(),
    val recentAddedContacts: List<Contact> = emptyList(),
    val selectedContact: Contact? = null,
    val isAddContactSheetOpen: Boolean = false,
    val isSelectContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,
)