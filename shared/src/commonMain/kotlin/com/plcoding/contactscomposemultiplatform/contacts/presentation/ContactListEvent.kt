package com.plcoding.contactscomposemultiplatform.contacts.presentation

import com.plcoding.contactscomposemultiplatform.contacts.domain.Contact

sealed interface ContactListEvent {
    object OnAddNewContactClick : ContactListEvent
    object OnDismissContact : ContactListEvent

    data class OnFirstNameChanged(val value: String) : ContactListEvent
    data class OnLastNameChanged(val value: String) : ContactListEvent
    data class OnEmailChanged(val value: String) : ContactListEvent
    data class OnPhoneNumberChanged(val value: String) : ContactListEvent
    class OnPhotoPicked(val bytes: ByteArray) : ContactListEvent
    object OnAddPhotoClicked : ContactListEvent
    object OnSaveContactClicked : ContactListEvent
    data class OnContactSelected(val contact: Contact) : ContactListEvent
    data class OnEditContact(val contact: Contact) : ContactListEvent
    object OnDeleteContact : ContactListEvent
}