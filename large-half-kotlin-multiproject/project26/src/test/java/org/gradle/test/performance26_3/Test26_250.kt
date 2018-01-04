package org.gradle.test.performance26_3

import org.junit.Assert.*

class Test26_250 {
    private val production = Production26_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}