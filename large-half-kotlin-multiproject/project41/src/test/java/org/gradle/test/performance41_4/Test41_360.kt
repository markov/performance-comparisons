package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_360 {
    private val production = Production41_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
