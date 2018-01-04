package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_9 {
    private val production = Production41_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
