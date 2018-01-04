package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_262 {
    private val production = Production15_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}