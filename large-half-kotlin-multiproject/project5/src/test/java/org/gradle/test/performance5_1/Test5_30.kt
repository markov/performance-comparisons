package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_30 {
    private val production = Production5_30("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}