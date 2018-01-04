package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_418 {
    private val production = Production20_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}