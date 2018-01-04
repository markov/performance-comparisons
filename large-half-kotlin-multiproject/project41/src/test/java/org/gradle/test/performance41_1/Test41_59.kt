package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_59 {
    private val production = Production41_59("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
