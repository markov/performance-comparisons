package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_49 {
    private val production = Production5_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}