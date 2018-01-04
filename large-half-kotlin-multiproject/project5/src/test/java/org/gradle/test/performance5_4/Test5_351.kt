package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_351 {
    private val production = Production5_351("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}