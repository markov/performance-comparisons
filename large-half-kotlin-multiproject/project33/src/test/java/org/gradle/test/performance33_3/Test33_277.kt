package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_277 {
    private val production = Production33_277("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}