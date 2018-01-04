package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_98 {
    private val production = Production41_98("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
