package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_338 {
    private val production = Production15_338("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}