package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_250 {
    private val production = Production24_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}