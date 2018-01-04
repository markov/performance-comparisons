package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_171 {
    private val production = Production25_171("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}