package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_109 {
    private val production = Production15_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}