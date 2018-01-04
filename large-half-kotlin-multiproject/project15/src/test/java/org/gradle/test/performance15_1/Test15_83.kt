package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_83 {
    private val production = Production15_83("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}