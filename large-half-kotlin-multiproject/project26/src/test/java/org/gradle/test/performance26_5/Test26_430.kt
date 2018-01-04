package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_430 {
    private val production = Production26_430("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}