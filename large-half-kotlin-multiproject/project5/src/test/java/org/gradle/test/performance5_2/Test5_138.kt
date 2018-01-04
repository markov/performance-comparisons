package org.gradle.test.performance5_2

import org.junit.Assert.*

class Test5_138 {
    private val production = Production5_138("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}