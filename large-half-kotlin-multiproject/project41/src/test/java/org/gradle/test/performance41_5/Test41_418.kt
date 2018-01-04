package org.gradle.test.performance41_5

import org.junit.Assert.*

class Test41_418 {
    private val production = Production41_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
