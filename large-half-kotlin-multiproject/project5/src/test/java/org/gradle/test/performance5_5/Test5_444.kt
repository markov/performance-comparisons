package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_444 {
    private val production = Production5_444("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}