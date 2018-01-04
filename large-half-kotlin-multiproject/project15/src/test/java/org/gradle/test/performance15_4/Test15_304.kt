package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_304 {
    private val production = Production15_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}