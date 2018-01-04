package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_339 {
    private val production = Production33_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}