package org.gradle.test.performance15_5

import org.junit.Assert.*

class Test15_430 {
    private val production = Production15_430("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}