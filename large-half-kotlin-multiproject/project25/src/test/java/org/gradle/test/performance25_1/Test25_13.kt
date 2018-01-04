package org.gradle.test.performance25_1

import org.junit.Assert.*

class Test25_13 {
    private val production = Production25_13("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}