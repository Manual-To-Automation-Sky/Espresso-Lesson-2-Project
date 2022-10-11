package com.example.basicproject

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@SmallTest
class TextFieldTest {

    @Rule @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun verifyEnteredTextSuccessfully() {
        val textFieldText = "Sky Espresso Lesson 1"
        val enteredText = "Entered Text: $textFieldText"

        // Find the Texxt Field button on the main page
        Espresso.onView(withId(R.id.textFieldButton))
                .perform(ViewActions.click())

        // Find the text field and type text into it
        Espresso.onView(withId(R.id.textField))
                .perform(ViewActions.typeText(textFieldText))

        // Close the Keyboard to prevent view issues
        ViewActions.closeSoftKeyboard()

        // Click the Submit button to enter the text
        Espresso.onView(withId(R.id.submitButton))
                .perform(ViewActions.click())

        // Verify that the text label is updated with the text entry.
        Espresso.onView(withId(R.id.enteredTextLabel))
                .check(ViewAssertions.matches(ViewMatchers.withText(enteredText)))
    }

    @Test
    fun verifyErrorWhenSubmitBlank() {
        val errorMessage = "No text was entered!"
        Espresso.onView(withId(R.id.textFieldButton))
                .perform(ViewActions.click())

        // Click the Submit button to enter the text
        Espresso.onView(withId(R.id.submitButton))
                .perform(ViewActions.click())
        Espresso.onView(withId(R.id.textFieldErrorLabel))
                .check(ViewAssertions.matches(ViewMatchers.withText(errorMessage)))
    }
}