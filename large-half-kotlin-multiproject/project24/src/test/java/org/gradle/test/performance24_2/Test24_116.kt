package org.gradle.test.performance24_2

import org.junit.Assert.*

class Test24_116 {
    private val production = Production24_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}