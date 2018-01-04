package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_368 {
    private val production = Production43_368("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
