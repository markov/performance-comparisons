package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_256 {
    private val production = Production24_256("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}