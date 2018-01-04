package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_271 {
    private val production = Production33_271("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}