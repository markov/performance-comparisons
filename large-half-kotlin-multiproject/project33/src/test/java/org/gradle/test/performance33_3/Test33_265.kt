package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_265 {
    private val production = Production33_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}