package org.gradle.test.performance40_2

import org.junit.Assert.*

class Test40_183 {
    private val production = Production40_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}