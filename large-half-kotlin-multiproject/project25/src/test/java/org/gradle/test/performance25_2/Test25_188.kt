package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_188 {
    private val production = Production25_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}