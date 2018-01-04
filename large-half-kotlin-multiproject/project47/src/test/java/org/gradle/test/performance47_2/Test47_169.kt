package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_169 {
    private val production = Production47_169("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
