package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_264 {
    private val production = Production41_264("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
