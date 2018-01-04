package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_163 {
    private val production = Production26_163("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}