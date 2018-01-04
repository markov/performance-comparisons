package org.gradle.test.performance25_1

import org.junit.Assert.*

class Test25_28 {
    private val production = Production25_28("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}