package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_397 {
    private val production = Production7_397("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}