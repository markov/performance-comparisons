package org.gradle.test.performance26_4

import org.junit.Assert.*

class Test26_333 {
    private val production = Production26_333("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}