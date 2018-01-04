package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_443 {
    private val production = Production20_443("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}