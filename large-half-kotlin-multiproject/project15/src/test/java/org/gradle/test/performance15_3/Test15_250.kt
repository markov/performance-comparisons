package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_250 {
    private val production = Production15_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}