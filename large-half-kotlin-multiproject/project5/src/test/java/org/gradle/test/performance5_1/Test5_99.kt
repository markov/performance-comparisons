package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_99 {
    private val production = Production5_99("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}