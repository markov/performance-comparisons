package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_162 {
    private val production = Production15_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}