package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_487 {
    private val production = Production7_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}