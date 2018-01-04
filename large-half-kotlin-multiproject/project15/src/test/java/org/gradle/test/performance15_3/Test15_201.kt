package org.gradle.test.performance15_3

import org.junit.Assert.*

class Test15_201 {
    private val production = Production15_201("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}