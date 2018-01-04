package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_412 {
    private val production = Production20_412("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}