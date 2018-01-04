package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_198 {
    private val production = Production15_198("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}