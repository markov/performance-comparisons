package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_186 {
    private val production = Production25_186("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}