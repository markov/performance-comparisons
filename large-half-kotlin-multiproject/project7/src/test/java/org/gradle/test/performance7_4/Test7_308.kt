package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_308 {
    private val production = Production7_308("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}