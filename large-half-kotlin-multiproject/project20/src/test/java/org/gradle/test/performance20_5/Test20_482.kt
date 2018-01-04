package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_482 {
    private val production = Production20_482("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}