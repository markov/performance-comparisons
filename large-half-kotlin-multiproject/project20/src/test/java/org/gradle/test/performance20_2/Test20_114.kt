package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_114 {
    private val production = Production20_114("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}