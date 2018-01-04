package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_393 {
    private val production = Production25_393("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}