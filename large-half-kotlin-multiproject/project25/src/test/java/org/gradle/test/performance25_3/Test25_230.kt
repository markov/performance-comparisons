package org.gradle.test.performance25_3

import org.junit.Assert.*

class Test25_230 {
    private val production = Production25_230("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}