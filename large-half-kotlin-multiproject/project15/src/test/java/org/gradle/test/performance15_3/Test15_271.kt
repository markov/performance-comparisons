package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_271 {
    private val production = Production15_271("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}