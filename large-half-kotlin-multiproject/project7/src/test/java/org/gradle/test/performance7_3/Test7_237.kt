package org.gradle.test.performance7_3

import org.junit.Assert.*

class Test7_237 {
    private val production = Production7_237("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}