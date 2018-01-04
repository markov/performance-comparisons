package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_490 {
    private val production = Production7_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}