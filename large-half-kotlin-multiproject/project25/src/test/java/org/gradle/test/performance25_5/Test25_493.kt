package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_493 {
    private val production = Production25_493("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}