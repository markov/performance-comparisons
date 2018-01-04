package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_164 {
    private val production = Production7_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}