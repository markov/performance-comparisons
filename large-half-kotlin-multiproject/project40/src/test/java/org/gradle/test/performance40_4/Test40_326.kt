package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_326 {
    private val production = Production40_326("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}