package org.gradle.test.performance24_2

import org.junit.Assert.*

class Test24_160 {
    private val production = Production24_160("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}