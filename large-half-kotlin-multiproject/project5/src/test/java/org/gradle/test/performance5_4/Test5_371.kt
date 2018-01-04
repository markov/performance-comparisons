package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_371 {
    private val production = Production5_371("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}