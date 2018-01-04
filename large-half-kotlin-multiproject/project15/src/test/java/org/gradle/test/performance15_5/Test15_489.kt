package org.gradle.test.performance15_5

import org.junit.Assert.*

class Test15_489 {
    private val production = Production15_489("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}