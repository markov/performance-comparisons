package org.gradle.test.performance25_5

import org.junit.Assert.*

class Test25_459 {
    private val production = Production25_459("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}