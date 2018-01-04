package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_236 {
    private val production = Production33_236("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}