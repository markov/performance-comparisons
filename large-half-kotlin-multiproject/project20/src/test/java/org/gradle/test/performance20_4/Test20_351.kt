package org.gradle.test.performance20_4

import org.junit.Assert.*

class Test20_351 {
    private val production = Production20_351("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}