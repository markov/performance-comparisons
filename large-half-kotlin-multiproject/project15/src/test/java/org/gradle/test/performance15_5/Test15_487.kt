package org.gradle.test.performance15_5

import org.junit.Assert.*

class Test15_487 {
    private val production = Production15_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}