package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_143 {
    private val production = Production7_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}