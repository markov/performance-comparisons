package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_389 {
    private val production = Production33_389("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}