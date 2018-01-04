package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_389 {
    private val production = Production15_389("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}