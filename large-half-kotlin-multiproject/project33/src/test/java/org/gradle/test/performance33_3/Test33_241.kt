package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_241 {
    private val production = Production33_241("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}