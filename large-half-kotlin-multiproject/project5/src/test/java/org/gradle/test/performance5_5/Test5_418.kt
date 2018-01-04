package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_418 {
    private val production = Production5_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}