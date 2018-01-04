package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_190 {
    private val production = Production25_190("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}