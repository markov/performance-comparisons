package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_400 {
    private val production = Production7_400("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}