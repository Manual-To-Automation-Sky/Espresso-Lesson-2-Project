package com.example.basicproject

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test


class ListTest {
    var listItems =
        arrayListOf("Android", "iPhone", "WindowsMobile",
            "Blackberry")

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun verifyListItems() {
        onView(withId(R.id.listButton))
            .perform(click())

        for (item in listItems) {
            onData(allOf(Matchers.instanceOf(String::class.java), `is`(item))).perform(click())
            onView(withText("Ok")).perform(click())
        }
    }
}