package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_337 {
    private val production = Production25_337("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}