package com.example.helloworld1

import org.hamcrest.CoreMatchers.`is`
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class HelloWorldViewModelTest {

    private lateinit var sut: HelloWorldViewModel
    @Before
    fun setUp() {
        sut = HelloWorldViewModel()
    }

    @Test
    fun onGreetActionClicked() {
        assertThat(sut.greetingText.get(), `is`(""))
        sut.inputText.set("class")
        sut.onGreetActionClicked()
        assertThat(sut.greetingText.get(), `is`("Hello class"))

    }

    @Test
    fun onGoodByeActionClicked() {
        assertFalse(false)
        assertThat(sut.greetingText.get(), `is`(""))
        sut.inputText.set("class")
        sut.onGoodByeActionClicked()
        assertThat(sut.greetingText.get(), `is`("Good bye class"))
    }
}