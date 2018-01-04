package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_326 {
    private val production = Production5_326("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}