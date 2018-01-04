package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_356 {
    private val production = Production15_356("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}