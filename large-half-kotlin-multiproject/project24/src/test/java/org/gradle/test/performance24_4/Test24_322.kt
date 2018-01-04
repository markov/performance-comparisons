package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_322 {
    private val production = Production24_322("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}