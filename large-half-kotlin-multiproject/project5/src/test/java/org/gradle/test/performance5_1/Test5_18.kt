package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_18 {
    private val production = Production5_18("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}