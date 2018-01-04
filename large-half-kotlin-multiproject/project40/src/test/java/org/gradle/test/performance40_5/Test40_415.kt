package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_415 {
    private val production = Production40_415("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}