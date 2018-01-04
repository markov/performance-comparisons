package org.gradle.test.performance25_3

import org.junit.Assert.*

class Test25_270 {
    private val production = Production25_270("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}