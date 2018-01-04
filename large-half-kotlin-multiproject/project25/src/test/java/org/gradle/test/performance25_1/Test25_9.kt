package org.gradle.test.performance25_1

import org.junit.Assert.*

class Test25_9 {
    private val production = Production25_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}