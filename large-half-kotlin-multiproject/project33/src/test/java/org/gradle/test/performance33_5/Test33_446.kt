package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_446 {
    private val production = Production33_446("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}