package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_193 {
    private val production = Production25_193("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}