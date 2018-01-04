package org.gradle.test.performance24_2

import org.junit.Assert.*

class Test24_191 {
    private val production = Production24_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}