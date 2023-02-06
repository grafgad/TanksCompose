package com.example.tankscompose.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val viewModel: MutableMap<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = viewModel[modelClass]
        return try {
            creator?.get() as T
        } catch (e: Exception) {
            throw e
        }
    }



}

fun main(args: Array<String>) {
    val j = "ab"
    val s = "aabbccd"

    var result = 0
    for (c in s) {
        if (j.contains(c)) {
            result += 1;
        }
    }

    println(result)
}