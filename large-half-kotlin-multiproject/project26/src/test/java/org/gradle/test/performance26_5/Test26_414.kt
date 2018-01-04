package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_414 {
    private val production = Production26_414("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}